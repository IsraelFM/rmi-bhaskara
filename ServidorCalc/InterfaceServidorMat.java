package ServidorCalc;

import java.rmi.*;

// Definição da interface que descreve os objetos remotos que poderao ser acessados pelo cliente
public interface InterfaceServidorMat extends Remote
{
    public double calculateDelta(double a, double b, double c) throws RemoteException;
    public double calculateX1(double a, double b, double delta) throws RemoteException;
    public double calculateX2(double a, double b, double delta) throws RemoteException;
}