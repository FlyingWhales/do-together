package com.doto.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ListDTO {
	
	private Long listId;

	private String listName;

	private boolean isActive;

	private Date createDate;

}
