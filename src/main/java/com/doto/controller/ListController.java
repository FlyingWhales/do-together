package com.doto.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping(value = "/save-list", headers="Content-Type=application/json")
	public boolean saveList(HttpServletRequest request) {
		List list = new List();
		list.setListName(request.getParameter("listname"));
		list.setActive(true);
		list.setUserId(1L);

		try {
			List result = listService.createList(list);
			if (null != result.getListId()) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
		}

		return false;
	}

}
