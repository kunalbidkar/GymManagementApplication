package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.Scheme;



public interface SchemeService {
	public void addScheme(Scheme scheme);
	public void updateScheme(Scheme scheme, int price);
	public List<Scheme> listScheme();
}
