package com.xpanxion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpanxion.DAO.SchemeDao;
import com.xpanxion.model.Scheme;
@Service
public class SchemeServiceImpl implements SchemeService {

	public SchemeDao getSchemeDao() {
		return schemeDao;
	}

	public void setSchemeDao(SchemeDao schemeDao) {
		this.schemeDao = schemeDao;
	}


	private SchemeDao schemeDao;
	public void addScheme(Scheme scheme) {
		System.out.println("In service");
		this.schemeDao.addScheme(scheme);
	}

	public void updateScheme(Scheme scheme, int price) {
		System.out.println("In service"+price+scheme.getSchemeId());
		this.schemeDao.updateScheme(scheme, price);
	}

	public List<Scheme> listScheme() {
		 System.out.println("Service called");
		 return  this.schemeDao.listScheme();
	}

}
