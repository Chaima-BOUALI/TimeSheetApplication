package tn.spring.timesheet.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@AllArgsConstructor
@Data
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NaturalId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "NAME")
	private String ProjectName; 
	@Column(name = "REF")
	private String ProjectRefrence; 
	@Column(name = "Description")
	private String ProjectDescription; 
	@Column(name = "WorkHours")
	private int WorkHours; 
	@Column(name = "PricePerHour")
	private int PricePerHour; 
	@Temporal(TemporalType.DATE)
    private Date date;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<TimeSheet> timesheet = new ArrayList<>();
	
	

}
