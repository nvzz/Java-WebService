package com;

import java.rmi.RemoteException;

import org.tempuri.CalculatorSoapProxy;

public class Client {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		CalculatorSoapProxy client = new CalculatorSoapProxy();

		System.out.println("EndPoint " + client.getEndpoint());
		System.out.println("Add " + client.add(3,6));
		System.out.println("Divide " + client.divide(10, 2));
		System.out.println("Substract " + client.subtract(10, 5));
		System.out.println("Multiply " + client.multiply(5, 5));
	}
	
	

}
