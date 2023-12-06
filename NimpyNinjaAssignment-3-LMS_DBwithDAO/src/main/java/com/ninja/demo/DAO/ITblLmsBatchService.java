package com.ninja.demo.DAO;

import java.util.List;

import com.ninja.demo.entity.TblLmsBatch;

public interface ITblLmsBatchService {

	public List<TblLmsBatch> showAllData();
	public TblLmsBatch addNewBatch(TblLmsBatch batch);
	public TblLmsBatch updateExistingBatch(TblLmsBatch updatesBatch);
	public TblLmsBatch deleteBatch(int batchId);
	
}
