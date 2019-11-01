package com.doto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doto.service.ListUrlService;

@RestController
@RequestMapping("/list-url")
public class ListUrlController extends ApplicationController {

	@Autowired
	ListUrlService listUrlService;

	@GetMapping("/insert")
	public boolean insert() {
		listUrlService.generateKey(1L , null);
		return true;
	}
	
	@GetMapping("revoke")
	public boolean revoke() {
		listUrlService.revokeListUrl(1L, 1L);
		return true;
	}
}
