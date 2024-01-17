package com.ninja.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ninja.demo.entity.TblLmsBatch;

@Repository

public interface TblLmsBatchRepository extends JpaRepository<TblLmsBatch, Integer>{
	
	List<TblLmsBatch> findByBatchName(String batchName);
	List<TblLmsBatch> findByBatchDescription(String batchDescription);
	List<TblLmsBatch> findByBatchStatus(String batchStatus);

}
