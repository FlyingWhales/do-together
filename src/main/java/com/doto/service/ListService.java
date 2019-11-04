package com.doto.service;

import org.springframework.stereotype.Service;

import com.doto.entity.List;
import com.doto.repository.ListRepository;

@Service
public class ListService {

	final private ListRepository listRepository;

	public ListService(ListRepository listRepository) {
		this.listRepository = listRepository;
	}

	public boolean saveList(List list) {

		List savedList = listRepository.save(list);

		if (savedList.getListId() == null) {
			return false;
		}

		return true;
	}

	public Iterable<List> getUserLists(Long userId) {
		return listRepository.findByUserId(userId);
	}

	public List getListByUserId(Long userId, Long listId) {

		return listRepository.findByUserIdAndListId(userId, listId).orElse(null);

	}

	public boolean delete(Long listId, Long userId) {
		
		List list = getListByUserId(userId, listId);
		
		if ( list != null) {
			list.setActive(false);
			listRepository.save(list);
			return true;
		}
		
		return false;
	}

}
