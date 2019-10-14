package com.doto.dto;

import java.util.Date;

import lombok.Data;

@Data
public class List {
	
	private Long listId;

	private String listName;

	private boolean isActive;

	private Date createDate;

}
