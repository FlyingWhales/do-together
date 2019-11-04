package com.doto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doto.entity.ListUrl;
import com.doto.service.ListUrlService;

@RestController
@RequestMapping("/list-url")
public class ListUrlController extends ApplicationController {

	@Autowired
	ListUrlService listUrlService;

	@PostMapping("/insert")
	public boolean insert(ListUrl listUrl) {
		//TODO: This part is unsafe. Anybody with an ID can manipulate it
		//Apply a better solution
		listUrlService.generateKey(1L , null);
		return true;
	}
	
	@DeleteMapping("/revoke")
	public boolean revoke(ListUrl listUrl) {
		Long userId = 1L; //TODO : Get user id from session
		listUrlService.revokeListUrl(listUrl.getListUrlId(), userId);
		return true;
	}
}
