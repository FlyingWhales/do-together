package com.doto.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.doto.entity.Task;
import com.doto.repository.TaskRepository;

@Service
public class TaskService {
	
	final private TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public boolean addTaskToList(Task task) {
		
		Task t = taskRepository.save(task);
		return t.getTaskId() == null;
	}
	
	public boolean deleteTaskFromList(Long taskId) {
		Task t = taskRepository.findById(taskId).orElse(null);
		
		if ( t != null ) {
			t.setActive(false);
			taskRepository.save(t);
			return true;
		}
		
		return false;
	}
	
	public Optional<Task> getTasksByListId(Long listId) {
		return taskRepository.findTaskByListId(listId);
	}
}
