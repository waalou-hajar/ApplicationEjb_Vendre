package entities;

import java.io.Serializable;
import java.lang.Integer;

/**
 * ID class for entity: LigneCommande
 *
 */ 
public class LigneCommandePK  implements Serializable {   
   
	         
	private Integer IdLivre;         
	private Integer IdCommande;
	private static final long serialVersionUID = 1L;

	public LigneCommandePK() {}

	

	public Integer getIdLivre() {
		return this.IdLivre;
	}

	public void setIdLivre(Integer IdLivre) {
		this.IdLivre = IdLivre;
	}
	

	public Integer getIdCommande() {
		return this.IdCommande;
	}

	public void setIdCommande(Integer IdCommande) {
		this.IdCommande = IdCommande;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof LigneCommandePK)) {
			return false;
		}
		LigneCommandePK other = (LigneCommandePK) o;
		return true
			&& (getIdLivre() == null ? other.getIdLivre() == null : getIdLivre().equals(other.getIdLivre()))
			&& (getIdCommande() == null ? other.getIdCommande() == null : getIdCommande().equals(other.getIdCommande()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getIdLivre() == null ? 0 : getIdLivre().hashCode());
		result = prime * result + (getIdCommande() == null ? 0 : getIdCommande().hashCode());
		return result;
	}
   
   
}
