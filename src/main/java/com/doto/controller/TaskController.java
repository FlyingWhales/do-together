package com.doto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doto.entity.Task;
import com.doto.service.ListService;
import com.doto.service.TaskService;

@RestController
@RequestMapping("/task-list")
public class TaskController extends ApplicationController {

	@Autowired
	TaskService taskService;

	@Autowired
	ListService listService;

	@GetMapping("/list-tasks/{listId}")
	public Iterable<Task> getTasksByListId(@PathVariable Long listId) {
		return taskService.getTasksByListId(listId, 1L);
	}

	@PostMapping("/add-task")
	public boolean addTask(@Validated Task task) {
		Long userId = 1L; // TODO : Get user id from session
		boolean isOwner = listService.isUserOwnerOfList(userId, task.getListId());

		if (isOwner) {
			taskService.addTaskToList(task);
		}

		return false;
	}
	
	@PutMapping("/update-task")
	public boolean updateTask(@Validated Task task) {
		Long userId = 1L; // TODO : Get user id from session
		boolean isOwner = listService.isUserOwnerOfList(userId, task.getListId());

		if (isOwner) {
			taskService.addTaskToList(task);
		}

		return false;
	}
	
	@DeleteMapping("/delete-task")
	public boolean DeleteTask(@Validated Task task) {
		Long userId = 1L; // TODO : Get user id from session
		boolean isOwner = listService.isUserOwnerOfList(userId, task.getListId());

		if (isOwner) {
			taskService.deleteTaskFromList(task.getTaskId());
		}

		return false;
	}
}
