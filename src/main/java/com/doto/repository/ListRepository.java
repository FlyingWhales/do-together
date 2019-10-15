package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.List;

@Repository
public interface ListRepository extends JpaRepository<List, Long>{

}
