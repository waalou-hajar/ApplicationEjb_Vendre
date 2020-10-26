package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Entity implementation class for Entity: Commande
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Commande implements Serializable {

	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private Integer idCommande;
	private double PrixCommande;
	private Date DateCommande;
	private static final long serialVersionUID = 1L;
	
	// Commande Client
	@XmlTransient
	@ManyToOne
	@JoinColumn(name="IdClient")
	private Client client;
     
	// commande ligneCommande 
	@XmlTransient
	@OneToMany(mappedBy = "commande")
	private List<LigneCommande> ListeLigneCommande; 
	
	
	public Commande() {
		super();
	}   
	public Integer getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}   
	public double getPrixCommande() {
		return this.PrixCommande;
	}

	public void setPrixCommande(double PrixCommande) {
		this.PrixCommande = PrixCommande;
	}   
	public Date getDateCommande() {
		return this.DateCommande;
	}

	public void setDateCommande(Date DateCommande) {
		this.DateCommande = DateCommande;
	}
   
}
