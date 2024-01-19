package com.ninja.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.demo.DAO.ITblLmsProgramService;
import com.ninja.demo.entity.TblLmsProgram;
import com.ninja.demo.exception.DataNotFound;


@RestController
@RequestMapping("/LMSDataProgram")
public class TblLmsProgramController {
	
	@Autowired
	ITblLmsProgramService programDAO;
	
	@GetMapping("/showAllData")
	public ResponseEntity<List<TblLmsProgram>> showAllBatchData(){
		return new ResponseEntity<List<TblLmsProgram>>(programDAO.showAllData(),HttpStatus.FOUND);
	}
	
	@PostMapping("/addNewProgram")
	public ResponseEntity<TblLmsProgram> addNewProgram(@Validated @RequestBody TblLmsProgram program)throws DataNotFound{
		return new ResponseEntity<TblLmsProgram>(programDAO.addNewProgram(program),HttpStatus.CREATED);
	}

	@PutMapping("/updateProgram")
	public ResponseEntity<TblLmsProgram> updateProgram(@Validated @RequestBody TblLmsProgram program){
		return new ResponseEntity<TblLmsProgram>(programDAO.updateProgram(program),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteProgram/{programId}")
	public ResponseEntity<TblLmsProgram> deleteProgram(@Validated @PathVariable int programId)throws DataNotFound{
		return new ResponseEntity<TblLmsProgram>(programDAO.deleteProgram(programId),HttpStatus.ACCEPTED);
	}
	
	//-------------------------------------------------------------------------------------------------//
	
	@DeleteMapping("/stringDeletedProgram/{programId}")
	public ResponseEntity<String> deletedProgram(@Validated @PathVariable int programId)throws DataNotFound{
		
		return new ResponseEntity<String>(programDAO.deletedProgram(programId),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findProgramById/{programId}")
	public ResponseEntity<TblLmsProgram> findProgramById(@Validated @PathVariable int programId)throws DataNotFound{
		
		return new ResponseEntity<TblLmsProgram>(programDAO.findProgramById(programId),HttpStatus.OK);
	}
	
	@GetMapping("/findProgramByName/{programName}")
	public ResponseEntity<List<TblLmsProgram>> findProgramByName(@Validated @PathVariable String programName){
		
		return new ResponseEntity<List<TblLmsProgram>>(programDAO.findByProgramName(programName),HttpStatus.OK);
	}
	
	@GetMapping("/findProgramByStatus/{programStatus}")
	public ResponseEntity<List<TblLmsProgram>> findProgramByStatus(@Validated @PathVariable String programStatus){
		
		return new ResponseEntity<List<TblLmsProgram>>(programDAO.findByProgramStatus(programStatus),HttpStatus.OK);
	}
	
	@GetMapping("/findProgramByDescription/{programDescription}")
	public ResponseEntity<List<TblLmsProgram>> findProgramByDescription(@Validated @PathVariable String programDescription){
		
		return new ResponseEntity<List<TblLmsProgram>>(programDAO.findByProgramDescription(programDescription),HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
