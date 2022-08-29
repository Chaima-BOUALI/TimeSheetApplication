package tn.spring.timesheet.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@AllArgsConstructor
@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NaturalId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "CONFIRM")
	private String confirmPassword;
	@Column(name = "ADRESS")
	private String adress;
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	@Column(name = "VERIF")
	private Boolean isEmailVerified;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Roles> role = new ArrayList<>();
}
