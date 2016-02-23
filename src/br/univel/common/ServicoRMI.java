package br.univel.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoRMI extends Remote {

	public static final String NOME = "SERVICO_RMI";
	
	public String greet(String nome) throws RemoteException;
	public double somar(double a, double b) throws RemoteException;
	public double multiplicar(double a, double b) throws RemoteException;
	public double dividir(double a, double b) throws RemoteException;
	public double subtrair(double a, double b) throws RemoteException;
	
}
