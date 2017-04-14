package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.Scheme;



public interface SchemeDao {
	public void addScheme(Scheme scheme);
	public void updateScheme(Scheme scheme, int price);
	public List<Scheme> listScheme(); 
}
