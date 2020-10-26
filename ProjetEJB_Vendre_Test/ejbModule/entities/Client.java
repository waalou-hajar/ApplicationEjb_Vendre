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
 * Entity implementation class for Entity: Client
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Client implements Serializable {

	  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlTransient
	private Integer IdClient;
	private String NomClient;
	private String PrenomClient;
	private String Password;
	private String Email;
	private static final long serialVersionUID = 1L;
	// Client avec commande

	@XmlTransient
	@OneToMany(mappedBy = "client")
    private List<Commande> commandes;
	public Client() {
		super();
	}
	public Integer getIdClient() {
		return IdClient;
	}
	public void setIdClient(Integer idClient) {
		IdClient = idClient;
	}
	public String getNomClient() {
		return NomClient;
	}
	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}
	public String getPrenomClient() {
		return PrenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		PrenomClient = prenomClient;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public Client(String nomClient, String prenomClient, String password, String email) {
		super();
		NomClient = nomClient;
		PrenomClient = prenomClient;
		Password = password;
		Email = email;
	}
	@Override
	public String toString() {
		return "Client [IdClient=" + IdClient + ", NomClient=" + NomClient + ", PrenomClient=" + PrenomClient
				+ ", Password=" + Password + ", Email=" + Email + ", commandes=" + commandes + "]";
	}  
	
	
   
   
}
