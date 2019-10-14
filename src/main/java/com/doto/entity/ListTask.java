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
@Table(name = "list_task")
public class ListTask {

	@Id
	@Column(name = "list_task_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long listTaskId;

	@NotBlank
	@Column(name = "user_id")
	private Long userId;

	@NotBlank
	@Column(name = "list_id")
	private Long listId;
}
