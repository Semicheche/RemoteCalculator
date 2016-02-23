package br.univel.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.univel.common.ServicoRMI;

public class Client {

	public static void main(String[] args) {
		Registry registry;
		try {
			registry = LocateRegistry.getRegistry("192.168.101.35", 1818);
			ServicoRMI servico = (ServicoRMI) registry.lookup(ServicoRMI.NOME);
			String retorno = servico.greet("Luciano");
			
			System.out.println(retorno);
			
			double soma = servico.somar(5, 3);
			double div = servico.dividir(5, 3);
			double mult = servico.multiplicar(5, 3);
			double sub = servico.subtrair(5,3);
			
			System.out.println(soma);
			System.out.println(div);
			System.out.println(mult);
			System.out.println(sub);

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}