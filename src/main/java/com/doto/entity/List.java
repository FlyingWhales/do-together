package com.doto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Data
@Entity
@Table(name = "lists")
public class List {
	
	@Id
	@Column(name = "list_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long listId;

	@NotBlank
	@Column(name = "list_name")
	private String listName;

	@NotBlank
	@Column(name = "is_active")
	private boolean isActive;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;

}
