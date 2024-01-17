package com.ninja.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ninja.demo.entity.TblLmsProgram;

@Repository
public interface TblLmsProgramRepository extends JpaRepository<TblLmsProgram, Integer> {
	
	List<TblLmsProgram> findByProgramName(String programName);
	List<TblLmsProgram> findByProgramDescription(String programDescription);
	List<TblLmsProgram> findByProgramStatus(String programStatus);

}
