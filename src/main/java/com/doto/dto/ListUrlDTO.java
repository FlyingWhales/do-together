package com.doto.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ListUrlDTO {

	private Long listUrlId;

	private Long listId;

	private String key;

	private Date createDate;

	private boolean isActive;

	private Date revokeDate;
}
