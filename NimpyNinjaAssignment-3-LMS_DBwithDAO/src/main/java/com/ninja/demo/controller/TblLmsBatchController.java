package com.ninja.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

import com.ninja.demo.DAO.ITblLmsBatchService;
import com.ninja.demo.entity.TblLmsBatch;
import com.ninja.demo.exception.LMSDataNotFound;
import com.ninja.demo.repository.TblLmsBatchRepository;


@RestController
@RequestMapping("/LMSDataBatch")
public class TblLmsBatchController {

	@Autowired
	ITblLmsBatchService batchDAO;
	TblLmsBatchRepository batchRepository;
	
	@GetMapping("/showAllData")
	public ResponseEntity<List<TblLmsBatch>> showAllData(){
		return new ResponseEntity<List<TblLmsBatch>>(batchDAO.showAllData(), HttpStatus.OK);
	}
	
	@PostMapping("/addNewBatch")
	public ResponseEntity<TblLmsBatch> addNewBatch(@Validated @RequestBody TblLmsBatch newBatch){
		return new ResponseEntity<TblLmsBatch>(batchDAO.addNewBatch(newBatch),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteBatch/{batchId}")
	public ResponseEntity<TblLmsBatch> deleteBatch(@Validated @PathVariable int batchId ) throws LMSDataNotFound{
		return new ResponseEntity<TblLmsBatch>(batchDAO.deleteBatch(batchId),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteABatchEntry/{batchId}")
	public ResponseEntity<TblLmsBatch> deleteABatchEntry(@Validated @PathVariable int batchId ) throws LMSDataNotFound{
		
		Optional<TblLmsBatch> deleteBatch = batchRepository.findById(batchId);
		
		if(deleteBatch.isEmpty())
			return new ResponseEntity<TblLmsBatch>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<TblLmsBatch>(batchDAO.deleteBatch(batchId),HttpStatus.OK);
		
	}
	
	@PutMapping("/updateBatch")
	public ResponseEntity<TblLmsBatch> updateExistingBatch(@Validated @RequestBody TblLmsBatch batch ) throws LMSDataNotFound{
		return new ResponseEntity<TblLmsBatch>(batchDAO.updateExistingBatch(batch), HttpStatus.OK);
	}
	
	
	//--------------------------------------------------------------------------------------------------------//
	
	@DeleteMapping("/stringDeletedBatch/{batchId}")
	public ResponseEntity<String> deletedBatch(@Validated @PathVariable int batchId){	 
	 return new ResponseEntity<String>(batchDAO.deletedBatch(batchId),HttpStatus.OK);	 
	}

 	@GetMapping("/findBatchById/{batchId}")
 	public ResponseEntity<TblLmsBatch> findBatchById(@Validated @PathVariable int batchId){	 
	 return new ResponseEntity<TblLmsBatch>(batchDAO.findBatchById(batchId),HttpStatus.OK);	 
 	}
	
 	@GetMapping("/findBatchByName/{batchName}")
 	public ResponseEntity<List<TblLmsBatch>> findBatchByName(@Validated @PathVariable String batchName){
 		return new ResponseEntity<List<TblLmsBatch>>(batchDAO.findByBatchName(batchName),HttpStatus.OK);
 	}
	
 	@GetMapping("/findBatchByStatus/{batchStatus}")
 	public ResponseEntity<List<TblLmsBatch>> findBatchByStatus(@Validated @PathVariable String batchStatus){
 		return new ResponseEntity<List<TblLmsBatch>>(batchDAO.findByBatchStatus(batchStatus),HttpStatus.OK);
 	}
	
 	@GetMapping("/findBatchByDescription/{batchDescription}")
 	public ResponseEntity<List<TblLmsBatch>> findBatchByDescription(@Validated @PathVariable String batchDescription){
 		return new ResponseEntity<List<TblLmsBatch>>(batchDAO.findByBatchDescription(batchDescription),HttpStatus.OK);
 	}
	
		
}
