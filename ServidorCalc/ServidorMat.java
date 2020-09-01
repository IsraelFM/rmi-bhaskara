package ServidorCalc;

import java.rmi.*;
import java.rmi.server.*;

// Classe no servidor que implementa os métodos remotos
public class ServidorMat extends UnicastRemoteObject implements InterfaceServidorMat
{
    /**
     *
     */
    private static final long serialVersionUID = -1591024814354107547L;

    public ServidorMat() throws RemoteException
    {
        System.out.println("Novo Servidor instanciado...");
    }

    public String calculateBhaskara(double a, double b, double delta) throws RemoteException
    {
        double x1 = (double) ((-(b) + Math.sqrt(delta)) / (2 * a));
        double x2 = (double) ((-(b) - Math.sqrt(delta)) / (2 * a));
        return "S = { " + x1 + ", " + x2 + "}";
    }

    public double calculateDelta(double a, double b, double c) throws RemoteException
    {
        double delta = (b * b) + (-4 * (a * c));
 
        if (delta < 0)
        {
            return -1;
        }
        return delta;
    }
} 