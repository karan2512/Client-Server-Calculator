/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.rmi.*;
/**
 *
 * @author Karan
 */
public interface servinterface extends Remote
{
    public double add(double a,double b) throws RemoteException;
    public double sub(double a,double b) throws RemoteException;
    public double mul(double a,double b) throws RemoteException;
    public double div(double a,double b) throws RemoteException;
    public double mod(double a,double b) throws RemoteException;
}
