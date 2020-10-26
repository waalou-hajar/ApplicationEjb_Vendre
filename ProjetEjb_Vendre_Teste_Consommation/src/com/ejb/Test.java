package com.ejb;

import java.util.List;

import javax.ejb.EJB;

import entities.*;
import metier.DBInteractionLocal;

public class Test {
	
	public static void main(String[] args) {
		
		DaoEJB daoejb=new DaoEJB();
		Client C=new Client("Client1", "Cliente", "123456", "cliente@client");
		daoejb.AjouterClient(C);

		System.out.println("***********************");
		List<Client> listesClient=daoejb.afficherClients();
		
		for (Client client : listesClient) {
			System.out.println(client.getNomClinet());
		}
	}

}
