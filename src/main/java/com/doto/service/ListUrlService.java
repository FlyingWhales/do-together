package com.doto.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.doto.entity.ListUrl;
import com.doto.repository.ListUrlRepository;
import com.doto.utils.DotoUtis;

@Service
public class ListUrlService {

	final private ListUrlRepository listUrlRepository;
	
	public ListUrlService(ListUrlRepository listUrlRepository) {
		this.listUrlRepository = listUrlRepository;
	}

	public String generateKey(Long listId, Date revokeDate) {

		final String key = DotoUtis.getMD5(UUID.randomUUID().toString());

		ListUrl listUrl = new ListUrl();

		listUrl.setListId(listId);
		listUrl.setKey(key);
		listUrl.setRevokeDate(revokeDate);
		listUrl.setActive(true);
		listUrl.setCreateDate(new Date()); // TODO: dafuq is that? should work by itself
		listUrlRepository.save(listUrl);

		return key;
	}

	public void revokeListUrl(Long listUrlId, Long userId) {

		if (isAuthorized(listUrlId, userId)) {
			ListUrl listUrl = listUrlRepository.findById(listUrlId).get();
			listUrl.setRevokeDate(new Date());
			listUrlRepository.save(listUrl);
		}

	}
	
	private boolean isAuthorized(Long listUrlId, Long userId) {
		return listUrlRepository.isUserAuthorizedToList(listUrlId, userId);
	}

}
