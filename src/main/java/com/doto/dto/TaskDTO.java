package com.doto.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TaskDTO {

	private Long taskId;

	private Long listId;

	private String text;

	private boolean isDone;

	private boolean isActive;

	private Date createDate;

}
