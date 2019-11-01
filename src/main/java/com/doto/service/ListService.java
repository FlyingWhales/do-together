package com.doto.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.doto.entity.List;
import com.doto.repository.ListRepository;

@Service
public class ListService {

	final private ListRepository listRepository;

	public ListService(ListRepository listRepository) {
		this.listRepository = listRepository;
	}

	public List createList(List list) throws Exception {

		List savedList = listRepository.save(list);

		if (savedList.getListId() == null) {
			throw new Exception("Liste kaydedilemedi"); // TODO: Handle properly
		}

		return savedList;
	}

	public Iterable<List> getUserLists(Long userId) {
		return listRepository.findByUserId(userId);
	}

	public List getListByUserId(Long userId, Long listId) {

		return listRepository.findByUserIdAndListId(userId, listId).orElse(null);

	}

	public boolean delete(Long listId, Long userId) {
		
		List l = getListByUserId(userId, listId);
		
		if ( l != null) {
			l.setActive(false);
			listRepository.save(l);
			return true;
		}
		
		return false;
	}

}
