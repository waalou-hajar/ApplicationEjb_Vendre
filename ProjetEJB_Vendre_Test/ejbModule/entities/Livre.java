package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Entity implementation class for Entity: Livre
 *
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Livre implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private Integer idLivre;
	private String NomLivre;
	private double PrixLivre;
	private Integer quantite;
	private static final long serialVersionUID = 1L;
	
	//livre  ligneCommande
	@XmlTransient
	@OneToMany(mappedBy = "livre")
	private List<LigneCommande> ListeligneCommande;

	public Livre() {
		super();
	}   
	public Integer getIdLivre() {
		return this.idLivre;
	}

	public void setIdLivre(Integer idLivre) {
		this.idLivre = idLivre;
	}   
	public String getNomLivre() {
		return this.NomLivre;
	}

	public void setNomLivre(String NomLivre) {
		this.NomLivre = NomLivre;
	}   
	public double getPrixLivre() {
		return this.PrixLivre;
	}

	public void setPrixLivre(double PrixLivre) {
		this.PrixLivre = PrixLivre;
	}   
	public Integer getQuantite() {
		return this.quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
   
}
