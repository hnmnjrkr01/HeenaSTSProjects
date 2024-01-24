package com.ninja.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja.demo.entity.TblLmsBatch;
import com.ninja.demo.exception.DataNotFound;
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
	public TblLmsBatch addNewBatch(TblLmsBatch batch) throws DataNotFound{
		
		if(batch.equals(null))
			throw new DataNotFound("Data is not provided!");
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
	 return optionalBatch.orElseThrow(()->new DataNotFound("Data with Id : "+updatedBatch.getBatchID()+" does not exist!!"));
	
	}

	@Override
	public TblLmsBatch deleteBatch(int batchId)throws DataNotFound {
		
		Optional<TblLmsBatch> deletedBatch = batchRepository.findById(batchId);
		
		if(deletedBatch.isEmpty())
			throw new DataNotFound("No data found with Id : "+ batchId);
		else 
			batchRepository.delete(deletedBatch.get());
			return deletedBatch.get();
	}

	
	@Override
	public String deletedBatch(int batchId)throws DataNotFound {

		Optional<TblLmsBatch> findBatchById = batchRepository.findById(batchId);
		
		if(findBatchById.isEmpty())
			throw new DataNotFound("No Data exist with Id : "+batchId);
		else 
			batchRepository.delete(findBatchById.get());
			return "Batch with ID: "+batchId+" deleted "+ findBatchById.get();

	}

	@Override
	public TblLmsBatch findBatchById(int batchId)throws DataNotFound {

		Optional<TblLmsBatch> findBatchById = batchRepository.findById(batchId);
		
		if(findBatchById.isEmpty())
			throw new DataNotFound("No Data exist with Id : "+batchId);
		else 
			return findBatchById.get();
	}

	@Override
	public List<TblLmsBatch> findByBatchName(String batchName) {
		
		return batchRepository.findByBatchName(batchName);
	}

	@Override
	public List<TblLmsBatch> findByBatchDescription(String batchDescription) {

		return batchRepository.findByBatchDescription(batchDescription);
	}

	@Override
	public List<TblLmsBatch> findByBatchStatus(String batchStatus) {
	
		return batchRepository.findByBatchStatus(batchStatus);
	}
	
	
	
	

}
