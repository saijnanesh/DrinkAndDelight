package com.capgemini.dd.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.exception.InvalidException;

public interface ServiceInterface {
	public boolean nameValidation(String name) throws InvalidException;
	public boolean supplierIdValidation(String supplierid,int key) throws InvalidException;
	public boolean quantityValueValidation(double quantityvalue,int key) throws InvalidException;
	public boolean quantityUnitValidation(double quantityunit,int key) throws InvalidException;
	public boolean orderIdValidation(String name);
	public boolean pricePerUnitValidation(double priceperunit,int key) throws InvalidException;
	public LocalDate addDeliveryDate();
	public List<RawMaterialorderUpdateDto> getOrderDetailsService();
	public  Map<Integer,RawMaterialOrder> getStockdata();
	public void getStockList();
	public void serviceValidation(RawMaterialorderUpdateDto bean);
	
	
	}
