package metier;

import java.util.List;

import javax.ejb.Local;

import entities.Admin;
import entities.Client;
import entities.Commande;
import entities.LigneCommande;
import entities.Livre;
import panier.LignePanier;
import panier.Panier;

@Local
public interface DBInteractionLocal {
	// pour admin 
		public Admin AjouterAdmin(Admin A);
		public void SupprimerAdmin(Integer idAdmin);
		public Admin ModifierAdmin(Admin  A);

		// pour client 
		public Client AjouterClient(Client C);
		public void SupprimerClient(int idClient);
		public Client ModifierClient(Client C);
		public List<Client> afficherClients();
		public Client chercherClient(int idClient);
		public int LoginIsValide(String Email,String password);
		
		public Client LoginValideClient(String Email,String password);
		
		public Admin LoginValideAdmin(String Email,String password);
		
		
		// pour livre
		 public List<Livre> afficherLivers();
		 public Livre chercherLivre(int idLivre);
		 public void SupprimerLivre(int idLivre);
		 public void ModifierLivre(Livre l);
		 public Livre AjouterLivre(Livre l);
		 
		 //commande 
		 
		 public List<Commande> afficherCommande();
		 public Commande chercherCommande(int idCommande);
		 public void SupprimerCommande(int idCommande);
		 public void ModifierCommande(Commande c);
		 public Commande AjouterCommande(Commande c);
		 
		 // LigneCommande :
		 
		 public List<LigneCommande> afficherLigneCommande();
		 public LigneCommande chercherLigneCommande(int idLigneCommande );
		 public void SupprimerLigneCommande(int idLigneCommande);
		 public void ModifierLigneCommande(LigneCommande lc);
		 public LigneCommande AjouterLigneCommande(LigneCommande lc);
		    
		 
		
		 
}
