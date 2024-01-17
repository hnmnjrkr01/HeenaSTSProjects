package com.ninja.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja.demo.entity.TblLmsProgram;
import com.ninja.demo.exception.LMSDataNotFound;
import com.ninja.demo.repository.TblLmsProgramRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TblLmsProgramServiceImpl implements ITblLmsProgramService{

	@Autowired
	TblLmsProgramRepository programRepository;
	
	@Override
	public List<TblLmsProgram> showAllData() {
		return programRepository.findAll();
	}

	@Override
	public TblLmsProgram addNewProgram(TblLmsProgram program) {
		
		if(program.equals(null))
			throw new LMSDataNotFound();
		else
			return programRepository.save(program);
		
	}

	@Override
	public TblLmsProgram updateProgram(TblLmsProgram updatedProgram) {

		Optional<TblLmsProgram> optionalProgram = programRepository.findById(updatedProgram.getProgramId());
		
		if(optionalProgram.isPresent()) {
			TblLmsProgram tempProgram = optionalProgram.get();
			
			tempProgram.setProgramName(updatedProgram.getProgramName());
			tempProgram.setProgramStatus(updatedProgram.getProgramStatus());
			tempProgram.setProgramDescription(updatedProgram.getProgramDescription());
			tempProgram.setLastModTime(updatedProgram.getLastModTime());
			tempProgram.setCreationTime(updatedProgram.getCreationTime());
			
			programRepository.save(tempProgram);
			return tempProgram;
			
		}		
		return optionalProgram.orElseThrow(()-> new LMSDataNotFound("Correct Data Not Found!!!"));
	}

	@Override
	public TblLmsProgram deleteProgram(int programId) {

		Optional<TblLmsProgram> deletedProgram = programRepository.findById(programId);
		
		if(deletedProgram.isEmpty())
			throw new LMSDataNotFound();
		else
		    programRepository.delete(deletedProgram.get());
		return deletedProgram.get();
	}

	
	
	@Override
	public String deletedProgram(int programId) {
		
		Optional<TblLmsProgram> deletedProgram = programRepository.findById(programId);
		
		if(deletedProgram.isEmpty())
			throw new LMSDataNotFound();
		else
		    programRepository.delete(deletedProgram.get());
		return "Program with ID "+ programId + " deleted : /n" +
		    										deletedProgram.get().toString();
	}

	@Override
	public TblLmsProgram findProgramById(int programId) {

		Optional<TblLmsProgram> findProgramId = programRepository.findById(programId);
		return findProgramId.get() ;
	}

	@Override
	public List<TblLmsProgram> findByProgramName(String programName) {
		
		return programRepository.findByProgramName(programName);
	}

	@Override
	public List<TblLmsProgram> findByProgramDescription(String programDescription) {
		return programRepository.findByProgramDescription(programDescription);
	}

	@Override
	public List<TblLmsProgram> findByProgramStatus(String programStatus) {
		return programRepository.findByProgramStatus(programStatus);
	}
	
	

}
