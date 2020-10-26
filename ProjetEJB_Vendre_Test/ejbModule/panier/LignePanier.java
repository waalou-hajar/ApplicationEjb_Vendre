package panier;

import entities.Livre;

public class LignePanier {
	
	
	private Livre livre;
    private int quantite;
	public LignePanier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LignePanier(Livre livre, int quantite) {
		super();
		this.livre = livre;
		this.quantite = quantite;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
    
    
    

}
