package com.doto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "user_list")
public class UserList {

	@Id
	@Column(name = "user_list_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userListId;

	@NotBlank
	@Column(name = "user_id")
	private Long userId;

	@NotBlank
	@Column(name = "list_id")
	private Long listId;
}
