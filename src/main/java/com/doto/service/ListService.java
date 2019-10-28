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

	public List createList(List list, Long userId) throws Exception {

		List savedList = listRepository.save(list);

		if (savedList.getListId() == null) {
			throw new Exception("Liste kaydedilemedi"); // TODO: Handle properly
		}

		return savedList;

	}

	public Iterable<List> getUserLists(Long userId) {
		return listRepository.findByUserId(userId);
	}

}
