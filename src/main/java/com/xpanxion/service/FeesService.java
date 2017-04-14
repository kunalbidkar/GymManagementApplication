package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.Fees;

public interface FeesService {
	public void addFees(Fees fees);
	public List<Fees> listMonthlyFees(String month) ;
	public List<Fees> listFees(int custId);
}
