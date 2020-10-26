package entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Entity implementation class for Entity: LigneCommande
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@IdClass(LigneCommandePK.class)
public class LigneCommande implements Serializable {

	 
	@Id
	private Integer IdLivre;   
	@Id
	
	private Integer IdCommande;
	private double Quantite;
	private static final long serialVersionUID = 1L;
	
	//lignecommande commande
	@XmlTransient
	@ManyToOne
	@JoinColumn(name="idCommande")
	private Commande commande;
	
	
	// Lignecommande livre
	@XmlTransient
	@ManyToOne
	@JoinColumn(name="idLivre")
	private Livre livre;
	

	public LigneCommande() {
		super();
	}   
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
	public double getQuantite() {
		return this.Quantite;
	}

	public void setQuantite(double Quantite) {
		this.Quantite = Quantite;
	}
   
}
