package com.ninja.demo.DAO;

import java.util.List;

import com.ninja.demo.entity.TblLmsBatch;
import com.ninja.demo.entity.TblLmsProgram;
import com.ninja.demo.exception.DataNotFound;

public interface ITblLmsProgramService {
	
	public List<TblLmsProgram> showAllData() ;
	public TblLmsProgram addNewProgram(TblLmsProgram program)throws DataNotFound;
	public TblLmsProgram updateProgram(TblLmsProgram updatedProgram);
	public TblLmsProgram deleteProgram(int programId)throws DataNotFound;
	public String deletedProgram(int programId)throws DataNotFound;
	public TblLmsProgram findProgramById(int programId)throws DataNotFound;
	public List<TblLmsProgram> findByProgramName(String programName);
	public List<TblLmsProgram> findByProgramDescription(String programDescription);
	public List<TblLmsProgram> findByProgramStatus(String programStatus);
	
	
	
}
