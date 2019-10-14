package com.doto.dto;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private Long userId;

	private String username;

	private String email;

	private String password;

	private Date createDate;
	
	private Date modifiedDate;
	
}
