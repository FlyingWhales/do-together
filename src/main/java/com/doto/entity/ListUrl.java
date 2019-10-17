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

@Entity
@Table(name = "list_url")
public class ListUrl {

	@Id
	@Column(name = "list_url_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long listUrlId;

	@Column(name = "list_id")
	private Long listId;

	@NotBlank
	@Column(name = "key")
	private String key;

	@CreatedDate
	@Temporal(TemporalType.DATE)
	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "is_active")
	private boolean isActive;

	@Temporal(TemporalType.DATE)
	@Column(name = "revoke_date")
	private Date revokeDate;

	public Long getListUrlId() {
		return listUrlId;
	}

	public void setListUrlId(Long listUrlId) {
		this.listUrlId = listUrlId;
	}

	public Long getListId() {
		return listId;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getRevokeDate() {
		return revokeDate;
	}

	public void setRevokeDate(Date revokeDate) {
		this.revokeDate = revokeDate;
	}
	
}
