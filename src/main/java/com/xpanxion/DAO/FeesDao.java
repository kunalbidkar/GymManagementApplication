package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.Fees;

public interface FeesDao {
	public void addFees(Fees fees);
	public List<Fees> listMonthlyFees(String month);
	public List<Fees> listFees(int custId);
}
