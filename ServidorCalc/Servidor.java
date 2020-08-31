package ServidorCalc;

import java.rmi.*;

// Classe que registra o servidor da aplicação junto ao servidor de nomes
public class Servidor
{
    public static void main(String argv[])
    {
        try
        {
            System.out.println("Subindo servidor...");
            // Associa o servidor a um nome para o acesso do cliente
            Naming.rebind("Bhaskara", new ServidorMat());
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um problema ao inicializar o servidor.\n"+e.toString());
        }
    }
}
