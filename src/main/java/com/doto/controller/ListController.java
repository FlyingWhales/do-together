package com.doto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doto.entity.List;
import com.doto.service.ListService;

@RestController
@RequestMapping("/list")
public class ListController {

	@Autowired
	ListService listService;

	@GetMapping("/user-lists")
	public Iterable<List> getLists() {

		return listService.getUserLists(1L);

	}

}
