package metier;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Admin;
import entities.Client;
import entities.Commande;
import entities.LigneCommande;
import entities.Livre;
import panier.LignePanier;
import panier.Panier;

/**
 * Session Bean implementation class DBInteraction
 */
@Stateless
@LocalBean
public class DBInteraction implements DBInteractionRemote, DBInteractionLocal {

    @PersistenceContext
	private EntityManager em;
    public DBInteraction() {
        // TODO Auto-generated constructor stub
    }

    // partie Admin 
    
    
    @SuppressWarnings("unchecked")
	@Override
	public Admin LoginValideAdmin(String Email, String password) {
		Query query=em.createQuery("select A from Admin A where A.Email=:x and A.Password=:y");
		query.setParameter("x", Email);
		query.setParameter("y", password);
		List<Admin> admin=query.getResultList();
		return admin.get(0);
	}
    
	@Override
	public Admin AjouterAdmin(Admin A) {
		em.persist(A);
		Admin a=em.find(Admin.class, A.getIdAdmin());
		return a;
	}

	@Override
	public void SupprimerAdmin(Integer idAdmin) {
		Admin a=em.find(Admin.class, idAdmin);
		em.remove(a);
	}

	@Override
	public Admin ModifierAdmin(Admin A) {
		em.persist(A);
		return A;
	}

	// partie client 
	
	@Override
	public Client LoginValideClient(String Email, String password) {
		Query query=em.createQuery("select A from Client A where A.Email=:x and A.Password=:y");
		query.setParameter("x", Email);
		query.setParameter("y", password);
		List<Client> client=query.getResultList();
		return client.get(0);
		
	}
	
	
	
	@Override
	public Client AjouterClient(Client C) {
		em.persist(C);
		Client a=em.find(Client.class, C.getIdClient());
		return a;
	}

	@Override
	public void SupprimerClient(int idClient) {
		Client c=em.find(Client.class, idClient);
		em.remove(c);
		
	}

	@Override
	public Client ModifierClient(Client C) {
		em.persist(C);
		return C;
	}

	@Override
	public List<Client> afficherClients() {
		Query query=em.createQuery("select C from Client C");
		@SuppressWarnings("unchecked")
		List<Client> listesclient=query.getResultList();
		return listesclient;
	}

	@Override
	public Client chercherClient(int idClient) {
		Client c=em.find(Client.class, idClient);
		return c;
	}

	@Override
	public int LoginIsValide(String Email, String password) {
		return 0;
	}

	
	// partie livre
	@Override
	public List<Livre> afficherLivers() {
		Query query=em.createQuery("select C from Livre C");
		@SuppressWarnings("unchecked")
		List<Livre> listeslivre=query.getResultList();
		return listeslivre;
		
	}

	@Override
	public Livre chercherLivre(int idLivre) {
		Livre livre=em.find(Livre.class, idLivre);
		return livre;
	}

	@Override
	public void SupprimerLivre(int idLivre) {
		Livre livre=em.find(Livre.class, idLivre);
		em.remove(livre);
	}

	@Override
	public void ModifierLivre(Livre l) {
      em.persist(l);
		
	}

	@Override
	public Livre AjouterLivre(Livre l) {
		em.persist(l);
 		return l;
	}
   
	// ligne Commande 
	@Override
	public List<Commande> afficherCommande() {
		Query query=em.createQuery("select C from Commande C");
		List<Commande> listCommande=query.getResultList();
		return listCommande;
	}

	@Override
	public Commande chercherCommande(int idCommande) {
		Commande commande=em.find(Commande.class, idCommande);
		return commande;
	}

	@Override
	public void SupprimerCommande(int idCommande) {
       Commande commande=em.find(Commande.class, idCommande);
       em.remove(commande);
	}

	@Override
	public void ModifierCommande(Commande c) {
		em.persist(c);
	}

	@Override
	public Commande AjouterCommande(Commande c) {
		em.persist(c);
		return c;
	}
     
	// partie Ligne Commande
	@Override
	public List<LigneCommande> afficherLigneCommande() {
		Query query=em.createQuery("selcet LC from LigneCommande LC ");
		List<LigneCommande> listLigneCommande=query.getResultList();
		return listLigneCommande;
	}

	@Override
	public LigneCommande chercherLigneCommande(int idLigneCommande) {
		LigneCommande lc=em.find(LigneCommande.class, idLigneCommande);
		return lc;
	}

	@Override
	public void SupprimerLigneCommande(int idLigneCommande) {
		LigneCommande lc=em.find(LigneCommande.class, idLigneCommande);
        em.remove(lc);
	}

	@Override
	public void ModifierLigneCommande(LigneCommande lc) {
      em.persist(lc);		
	}

	@Override
	public LigneCommande AjouterLigneCommande(LigneCommande lc) {
		em.persist(lc);
		return lc;
	}
      
	

	 

	

}
