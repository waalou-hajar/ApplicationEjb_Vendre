package com.servlet.ejb;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Client;
import metier.DBInteractionLocal;


@WebServlet("/ServlteEJB")
public class ServlteEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
    DBInteractionLocal metier;
  
    public ServlteEJB() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Client C=new Client("Client1", "Cliente", "123456", "cliente@client");
		//metier.AjouterClient(C);
		
		System.out.println("***********************");
		List<Client> listesClient=metier.afficherClients();
		
		for (Client client : listesClient) {
			System.out.println(client.getNomClinet());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
