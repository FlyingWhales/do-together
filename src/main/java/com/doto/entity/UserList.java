package com.doto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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

	public Long getUserListId() {
		return userListId;
	}

	public void setUserListId(Long userListId) {
		this.userListId = userListId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getListId() {
		return listId;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

}
