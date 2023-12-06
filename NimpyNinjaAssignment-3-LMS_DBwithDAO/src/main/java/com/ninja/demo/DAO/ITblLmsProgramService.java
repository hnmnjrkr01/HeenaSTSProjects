package com.ninja.demo.DAO;

import java.util.List;

import com.ninja.demo.entity.TblLmsProgram;

public interface ITblLmsProgramService {
	
	public List<TblLmsProgram> showAllData();
	public TblLmsProgram addNewProgram(TblLmsProgram program);
	public TblLmsProgram updateProgram(TblLmsProgram updatedProgram);
	public TblLmsProgram deleteProgram(int programId);
	
}
