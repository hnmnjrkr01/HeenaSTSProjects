package com.ninja.demo.DAO;

import java.util.List;

import com.ninja.demo.entity.TblLmsBatch;
import com.ninja.demo.entity.TblLmsProgram;

public interface ITblLmsProgramService {
	
	public List<TblLmsProgram> showAllData();
	public TblLmsProgram addNewProgram(TblLmsProgram program);
	public TblLmsProgram updateProgram(TblLmsProgram updatedProgram);
	public TblLmsProgram deleteProgram(int programId);
	public String deletedProgram(int programId);
	public TblLmsProgram findProgramById(int programId);
	public List<TblLmsProgram> findByProgramName(String programName);
	public List<TblLmsProgram> findByProgramDescription(String programDescription);
	public List<TblLmsProgram> findByProgramStatus(String programStatus);
	
	
	
}
