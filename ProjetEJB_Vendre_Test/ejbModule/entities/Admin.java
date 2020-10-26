package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Admin implements Serializable {

	@XmlTransient
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAdmin;
	private String NomAdmin;
	private String PrenomAdmin;
	private String Email;
	private String Password;
	private int privilege;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	
	
	public Admin(String nomAdmin, String prenomAdmin, String email, String password, int privilege) {
		super();
		NomAdmin = nomAdmin;
		PrenomAdmin = prenomAdmin;
		Email = email;
		Password = password;
		this.privilege = privilege;
	}


	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public Integer getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}   
	public String getNomAdmin() {
		return this.NomAdmin;
	}

	public void setNomAdmin(String NomAdmin) {
		this.NomAdmin = NomAdmin;
	}   
	public String getPrenomAdmin() {
		return this.PrenomAdmin;
	}

	public void setPrenomAdmin(String PrenomAdmin) {
		this.PrenomAdmin = PrenomAdmin;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}   
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	
   
}
