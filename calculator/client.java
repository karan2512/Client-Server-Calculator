/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.io.*;
import java.util.*;
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Karan
 */
public class client {
    
    public static  void main(String args[]) throws RemoteException{
        
        String choice;
        Scanner scan =new Scanner(System.in);
        
        try
        {   
            System.out.println("Enter two number: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Enter operation: ");
            choice = scan.next();
            
               
            Registry reg=LocateRegistry.getRegistry("127.0.0.1",9999);  
            servinterface i = (servinterface)reg.lookup("Server");  
            System.out.println("First number: "+a);  
            System.out.println("Second number: "+b); 
            
            switch(choice)
            {
                case "+":
                    System.out.println("Add:\t"+i.add(a,b));
                    break;
                case "-":
                    System.out.println("Sub:\t"+i.sub(a,b));
                    break;
                case "*":
                    System.out.println("Mul:\t"+i.mul(a,b));
                    break;
                case "/":
                    System.out.println("Div:\t"+i.div(a,b));
                    break;
                case "%":
                    System.out.println("Mod:\t"+i.mod(a,b));
                    break;
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
