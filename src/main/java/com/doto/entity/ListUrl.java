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
@Table(name = "list_url")
public class ListUrl {

	@Id
	@Column(name = "list_url_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long listUrlId;

	@NotBlank
	@Column(name = "list_id")
	private Long listId;

	@NotBlank
	@Column(name = "key")
	private String key;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;

	@NotBlank
	@Column(name = "is_active")
	private boolean isActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "revoke_date")
	private Date revokeDate;
}
