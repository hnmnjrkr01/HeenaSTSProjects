package com.ninja.demo.DAO;

import java.util.List;

import com.ninja.demo.entity.TblLmsBatch;

public interface ITblLmsBatchService {

	public List<TblLmsBatch> showAllData();
	public TblLmsBatch addNewBatch(TblLmsBatch batch);
	public TblLmsBatch updateExistingBatch(TblLmsBatch updatesBatch);
	public TblLmsBatch deleteBatch(int batchId);
	public String deletedBatch(int batchId);
	public TblLmsBatch findBatchById(int batchId);
	public List<TblLmsBatch> findByBatchName(String batchName);
	public List<TblLmsBatch> findByBatchDescription(String batchDescription);
	public List<TblLmsBatch> findByBatchStatus(String batchStatus);
	
}
