package com.insurance.monocept.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class Insurance extends BaseEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	private String accNo;
		
	private boolean Active;
	
	private String completedSteps;
	
	private boolean completed;
	
	private String status;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private InsuranceScheme insuranceScheme;
	
	
	
	
}
