package com.ninja.demo.DAO;

import java.util.List;

import com.ninja.demo.entity.TblLmsBatch;
import com.ninja.demo.exception.DataNotFound;

public interface ITblLmsBatchService {

	public List<TblLmsBatch> showAllData();
	public TblLmsBatch addNewBatch(TblLmsBatch batch)throws DataNotFound;
	public TblLmsBatch updateExistingBatch(TblLmsBatch updatesBatch);
	public TblLmsBatch deleteBatch(int batchId)throws DataNotFound;
	public String deletedBatch(int batchId)throws DataNotFound;
	public TblLmsBatch findBatchById(int batchId)throws DataNotFound;
	public List<TblLmsBatch> findByBatchName(String batchName);
	public List<TblLmsBatch> findByBatchDescription(String batchDescription);
	public List<TblLmsBatch> findByBatchStatus(String batchStatus);
	
}
