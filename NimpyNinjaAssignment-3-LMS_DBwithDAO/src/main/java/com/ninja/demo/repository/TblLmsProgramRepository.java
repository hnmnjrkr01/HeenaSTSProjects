package com.ninja.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ninja.demo.entity.TblLmsProgram;

@Repository
public interface TblLmsProgramRepository extends JpaRepository<TblLmsProgram, Integer> {

}
