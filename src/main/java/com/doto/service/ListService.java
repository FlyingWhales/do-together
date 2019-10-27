package com.doto.service;

import org.springframework.stereotype.Service;

import com.doto.entity.List;
import com.doto.entity.UserList;
import com.doto.repository.ListRepository;
import com.doto.repository.UserListRepository;

@Service
public class ListService {

	final private ListRepository listRepository;
	final private UserListRepository userListRepository;

	public ListService(ListRepository listRepository, UserListRepository userListRepository) {
		this.listRepository = listRepository;
		this.userListRepository = userListRepository;

	}

	public List createList(List list, Long userId) throws Exception {
		
		List savedList = listRepository.save(list);
		
		if ( savedList.getListId() != null ) {
			UserList userList = new UserList();
			userList.setListId(savedList.getListId());
			userList.setUserId(userId);
			userListRepository.save(userList);
		} else {
			throw new Exception("Liste kaydedilemedi"); //TODO: Handle properly
		}
		
		return savedList;
		
	}
	
	public Iterable<List> getUserLists(Long userId) {
		return listRepository.findByUserId(userId);
	}

}
