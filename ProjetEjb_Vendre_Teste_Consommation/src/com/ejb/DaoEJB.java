package com.ejb;

import java.util.List;

import javax.ejb.EJB;

import entities.Admin;
import entities.Client;
import entities.Commande;
import entities.LigneCommande;
import entities.Livre;
import metier.DBInteractionLocal;

public class DaoEJB {
	@EJB
	DBInteractionLocal metier;

	
	public Admin AjouterAdmin(Admin A) {
		return metier.AjouterAdmin(A);
	}

	public void SupprimerAdmin(Integer idAdmin) {
		metier.SupprimerAdmin(idAdmin);
	}

	public Admin ModifierAdmin(Admin A) {
		return metier.ModifierAdmin(A);
	}

	public Client AjouterClient(Client C) {
		return metier.AjouterClient(C);
	}

	public void SupprimerClient(int idClient) {
		metier.SupprimerClient(idClient);
	}

	public Client ModifierClient(Client C) {
		return metier.ModifierClient(C);
	}

	public List<Client> afficherClients() {
		return metier.afficherClients();
	}

	public Client chercherClient(int idClient) {
		return metier.chercherClient(idClient);
	}

	public int LoginIsValide(String Email, String password) {
		return metier.LoginIsValide(Email, password);
	}

	public Client LoginValideClient(String Email, String password) {
		return metier.LoginValideClient(Email, password);
	}

	public Admin LoginValideAdmin(String Email, String password) {
		return metier.LoginValideAdmin(Email, password);
	}

	public List<Livre> afficherLivers() {
		return metier.afficherLivers();
	}

	public Livre chercherLivre(int idLivre) {
		return metier.chercherLivre(idLivre);
	}

	public void SupprimerLivre(int idLivre) {
		metier.SupprimerLivre(idLivre);
	}

	public void ModifierLivre(Livre l) {
		metier.ModifierLivre(l);
	}

	public Livre AjouterLivre(Livre l) {
		return metier.AjouterLivre(l);
	}

	public List<Commande> afficherCommande() {
		return metier.afficherCommande();
	}

	public Commande chercherCommande(int idCommande) {
		return metier.chercherCommande(idCommande);
	}

	public void SupprimerCommande(int idCommande) {
		metier.SupprimerCommande(idCommande);
	}

	public void ModifierCommande(Commande c) {
		metier.ModifierCommande(c);
	}

	public Commande AjouterCommande(Commande c) {
		return metier.AjouterCommande(c);
	}

	public List<LigneCommande> afficherLigneCommande() {
		return metier.afficherLigneCommande();
	}

	public LigneCommande chercherLigneCommande(int idLigneCommande) {
		return metier.chercherLigneCommande(idLigneCommande);
	}

	public void SupprimerLigneCommande(int idLigneCommande) {
		metier.SupprimerLigneCommande(idLigneCommande);
	}

	public void ModifierLigneCommande(LigneCommande lc) {
		metier.ModifierLigneCommande(lc);
	}

	public LigneCommande AjouterLigneCommande(LigneCommande lc) {
		return metier.AjouterLigneCommande(lc);
	}
	
	

}
