package com.capgemini.dd.service;

import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.exception.InvalidException;

public interface ServiceInterface {
	public void getStockList();
	public boolean nameValidation(String name) throws InvalidException;
	public boolean supplierIdValidation(String supplierid,int key) throws InvalidException;
	public boolean quantityValueValidation(double quantityvalue,int key) throws InvalidException;
	public boolean quantityUnitValidation(double quantityunit,int key) throws InvalidException;
	public boolean orderIdValidation(String name,String orderid);
	public boolean pricePerUnitValidation(double priceperunit,int key) throws InvalidException;
	public void serviceValidation(RawMaterialorderUpdateDto bean);
	
		
	
	
}
