package com.doto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.List;

@Repository
public interface ListRepository extends JpaRepository<List, Long>{

	Optional<List> findByUserId(Long userId);
}
