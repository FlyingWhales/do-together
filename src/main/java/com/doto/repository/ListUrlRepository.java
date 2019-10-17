package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doto.entity.ListUrl;

@Repository
public interface ListUrlRepository extends JpaRepository<ListUrl, Long> {

	//@formatter:off
	@Query("Select true from ListUrl listUrl "
			+ "inner join List list on list.listId = listUrl.listId "
			+ "inner join UserList userList on userList.listId = list.listId "
			+ "where listUrl.listUrlId = ?1 and userList.userId = ?2")
	//@formatter:on
	boolean isUserAuthorizedToList(Long listUrlId, Long userId);
}
