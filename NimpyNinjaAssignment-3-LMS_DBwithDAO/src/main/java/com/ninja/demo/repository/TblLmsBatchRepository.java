package com.ninja.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ninja.demo.entity.TblLmsBatch;

@Repository

public interface TblLmsBatchRepository extends JpaRepository<TblLmsBatch, Integer>{

}
