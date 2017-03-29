package com.linkedin.learning.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.linkedin.learning.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	RoomEntity findById(Long id);
}
