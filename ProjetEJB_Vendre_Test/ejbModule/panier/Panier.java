package panier;

import java.util.ArrayList;
import java.util.List;

import entities.Livre;

public class Panier {
	
	private ArrayList<LignePanier>  lignesPanier;
	
	public Panier() {
		lignesPanier =new ArrayList<LignePanier>();
	}
	
	public Panier(ArrayList<LignePanier> lignesPanier) {
		super();
		this.lignesPanier = lignesPanier;
	}

	public ArrayList<LignePanier> getLignesPanier() {
		return lignesPanier;
	}

	public void setLignesPanier(ArrayList<LignePanier> lignesPanier) {
		this.lignesPanier = lignesPanier;
	}
	
	public void AddLivrePanier(Livre livre) {
		for (LignePanier lignePanier : this.lignesPanier) {
			if(lignePanier.getLivre().getNomLivre().equals(livre.getNomLivre())) {
				lignePanier.setQuantite(lignePanier.getQuantite()+1);
				return ;
			}
			((List<LignePanier>) lignePanier).add(new LignePanier(livre, 1));
		}
	}
	
	public void DeleteLignePanier(int idLivre) {
		for (LignePanier lignePanier : lignesPanier) {
			if(lignePanier.getLivre().getIdLivre().equals(idLivre)) {
				((List<LignePanier>) lignePanier).remove(lignePanier);
				return ;
			}
		}
	}
	
	public void ViderPanier() {
		this.lignesPanier=null;
	}
	
	  public void vider(){
	       while (lignesPanier.get(0) != null) {
	          lignesPanier.remove(lignesPanier.get(0));
	       }
	   }
	  
	  
	               
	    

}
