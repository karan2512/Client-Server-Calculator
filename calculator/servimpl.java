/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Karan
 */
public class servimpl extends UnicastRemoteObject implements servinterface 
{
    
    public servimpl() throws RemoteException
    {
        super();
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        return (a+b);
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
        return (a-b);
    }

    @Override
    public double mul(double a, double b) throws RemoteException {
        return (a*b);
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        return (a/b);
    }

    @Override
    public double mod(double a, double b) throws RemoteException {
        return (a%b);
    }
    
}
