package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.ListUrl;;

@Repository
public interface ListUrlRepository extends JpaRepository<ListUrl, Long>{

}
