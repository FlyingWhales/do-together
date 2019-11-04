package com.doto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doto.entity.List;
import com.doto.service.ListService;

@RestController
@RequestMapping("/list")
public class ListController extends ApplicationController {

	@Autowired
	ListService listService;

	@GetMapping("/user-lists")
	public Iterable<List> getLists() {
		return listService.getUserLists(1L);
	}

	@PostMapping(value = "/save-list")
	public boolean saveList(@Validated List list) {
		list.setUserId(1L); //TODO : Get user id from session
		return listService.saveList(list);
	}
	
	@PutMapping(value = "/save-list")
	public boolean updateList(@Validated List list) {
		list.setUserId(1L); //TODO : Get user id from session
		return listService.saveList(list);
	}
	
	/* It doesn't actually delete list but makes it invisible */
	@DeleteMapping(value = "/delete-list")
	public boolean deleteList(List list) {
		list.setUserId(1L); //TODO : Get user id from session
		return listService.delete(list.getListId(), 1L);
	}

}
