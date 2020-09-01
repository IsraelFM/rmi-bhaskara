package ClienteCalc;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import ServidorCalc.InterfaceServidorMat;

public class Cliente
{
    private InterfaceServidorMat msi; // A interface para o objeto remoto

	public Cliente()
	{
		System.out.println("Executando Cliente... \n");
		try
        {   // Acessa o servidor de nomes para localização das funções remotas
			msi = (InterfaceServidorMat) Naming.lookup("rmi://127.0.1.1/Bhaskara");
		}
		catch (final Exception e)
		{
            System.out.println("Falhou a execucao do Cliente.\n"+e);
			System.out.println("Certifique se a aplicacao no servidor esta em execucao.\n");
			System.exit(0);
		}
	}

	public static void main (final String[] argv)
	{
		final Cliente cliente = new Cliente();
        final Scanner keyboard = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("Entre com valores de a, b e c separados por espaco:");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();

		try
		{   // Cada chamada de uma função remota que é uma instância da classe Cliente
            System.out.println("Bhaskara ("+a+"x² + "+b+"x + "+c+"):");
            delta = cliente.delta(a, b, c);

            if (delta == -1)
            {
                System.out.println("Delta não possui raiz!");
            }
            else{
                System.out.println(cliente.bhaskara(a, b, delta));
            }
		}
		catch (final Exception e)
		{
            System.out.println("Excecao durante chamadas remotas:" +e);
        }

        keyboard.close();
	}

	// Chamada para a função remota que retornará os resultados de delta, x' e x"
	public double delta(double a, double b, double c) throws RemoteException{
        return msi.calculateDelta(a, b, c);
    }
    public String bhaskara(double a, double b, double delta) throws RemoteException{
        return msi.calculateBhaskara(a, b, delta);
    }
}