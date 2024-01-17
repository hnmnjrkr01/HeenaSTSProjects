package com.ninja.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja.demo.entity.TblLmsBatch;
import com.ninja.demo.exception.LMSDataNotFound;
import com.ninja.demo.repository.TblLmsBatchRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TblLmsBatchServiceImpl implements ITblLmsBatchService{

	@Autowired
	TblLmsBatchRepository batchRepository;
	
	@Override
	public List<TblLmsBatch> showAllData() {
		return batchRepository.findAll();
	}

	@Override
	public TblLmsBatch addNewBatch(TblLmsBatch batch) {
		
		if(batch.equals(null))
			throw new LMSDataNotFound();
		else			
			return batchRepository.save(batch);
	}

	@Override
	public TblLmsBatch updateExistingBatch(TblLmsBatch updatedBatch) {
		
	Optional<TblLmsBatch> optionalBatch = batchRepository.findById(updatedBatch.getBatchID());
	
	 if(optionalBatch.isPresent()) {
			 TblLmsBatch tempBatch = optionalBatch.get();
			 
			 
			 tempBatch.setBatchDescription(updatedBatch.getBatchDescription());
			 tempBatch.setBatchName(updatedBatch.getBatchName());
			 tempBatch.setBatchNoOfClasses(updatedBatch.getBatchNoOfClasses());
			 tempBatch.setBatchStatus(updatedBatch.getBatchStatus());
			 tempBatch.setCreationTime(updatedBatch.getCreationTime());
			 tempBatch.setLastModTime(updatedBatch.getLastModTime());
			 tempBatch.setLmsProgram(updatedBatch.getLmsProgram());
			 
			 batchRepository.save(tempBatch);
			 return tempBatch;
	 	}
	 return optionalBatch.orElseThrow(()->new LMSDataNotFound("Correct Data not provided!"));
	
	}

	@Override
	public TblLmsBatch deleteBatch(int batchId) {
		
		Optional<TblLmsBatch> deletedBatch = batchRepository.findById(batchId);
		
		if(deletedBatch.isEmpty())
			throw new LMSDataNotFound();
		else {
			batchRepository.delete(deletedBatch.get());
			
			}
		
		return deletedBatch.get();
	}

	@Override
	public TblLmsBatch findBatchById(int batchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblLmsBatch> findByBatchName(String batchName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblLmsBatch> findByBatchDescription(String batchDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblLmsBatch> findByBatchStatus(String batchStatus) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
