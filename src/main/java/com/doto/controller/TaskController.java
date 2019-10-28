package com.doto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doto.entity.Task;
import com.doto.service.TaskService;

@RestController
@RequestMapping("/task-list")
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@GetMapping("/list-tasks/{listId}")
	public Iterable<Task> getTasksByListId (@PathVariable Long listId) {
		return taskService.getTasksByListId(listId, 1L);
	}
}
