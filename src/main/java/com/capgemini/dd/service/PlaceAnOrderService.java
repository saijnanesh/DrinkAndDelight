package com.capgemini.dd.service;
import com.capgemini.dd.exception.*;

import java.time.LocalDate;
import java.util.*;
import com.capgemini.dd.dao.PlaceAnOrderDao;
import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.exception.InvalidException;

public class PlaceAnOrderService implements ServiceInterface {
	
	PlaceAnOrderDao orderObj = new PlaceAnOrderDao();
	Map<Integer,RawMaterialOrder> mapOrder;
	public PlaceAnOrderService()
	{
		
		mapOrder=orderObj.getDataDao();
		
	}

	
	List<String> rawMaterialName = new  ArrayList<>();
	List<String> supplierId = new  ArrayList<>();
	List<Double> quantityValue = new  ArrayList<>();
	List<Double> quantityUnit = new  ArrayList<>();
	List<Double> pricePerUnit = new  ArrayList<>();
	boolean flag=true;
	
	
		
	
	
	
	public void getStockList()
	{
		for(Map.Entry<Integer,RawMaterialOrder> map : mapOrder.entrySet())
		{
			rawMaterialName.add(map.getValue().getName());
			supplierId.add(map.getValue().getSupplierId());
			quantityValue.add(map.getValue().getQuantityValue());
			quantityUnit.add(map.getValue().getQuantityUnit());
			pricePerUnit.add(map.getValue().getPricePerUnit());
		}
	
		
	}
	
	
	
	
	
	
	
	
	public boolean nameValidation(String name) throws InvalidException
	{
		
	if(!rawMaterialName.contains(name) && name.matches("[a-z][A-z]\\D*"))
			{
		 throw  new InvalidException("Invalid Name");
			}
			else
			{
				
				return true;
			}	
		}
		
	
	
	public boolean supplierIdValidation(String supplierid,int key) throws InvalidException
	{
			if(!supplierId.get(key).contains(supplierid))
			{
				throw new InvalidException("Invalid supplier details");
			}
			else
			{
				
				return true;
			}
		}
		
	
	
	public boolean quantityValueValidation(double quantityvalue,int key) throws InvalidException
	{
			if(quantityvalue>quantityValue.get(key))
			{

				throw new InvalidException("Invalid Quantity Value");
			
			}
			else
			{
				
				return true;
			}
		}
		
	
		
	public boolean quantityUnitValidation(double quantityunit,int key) throws InvalidException 
	{
	
			if(quantityunit>quantityUnit.get(key))
			{

				throw new InvalidException("Invalid Quantity Unit ");
			}
			else
			{
				
				return true;
			}
		}
		
	
	
	public boolean orderIdValidation(String name) 
	{
			if(rawMaterialName.contains(name))
				return true;
			else
				return false;
			
		}
		
	
	public boolean pricePerUnitValidation(double priceperunit,int key) throws InvalidException{
			if(!pricePerUnit.get(key).equals(priceperunit))
			{

				throw new InvalidException("Invalid Price");
			
			}
			else
			{
				return true;
			}
		
	}
	
	
	public LocalDate addDeliveryDate()
	{
		LocalDate currentDate=LocalDate.now();
	
		return 	currentDate.plusDays(5);
	}
		
		
		public void serviceValidation(RawMaterialorderUpdateDto bean)
		{
			orderObj.addOrderDao(bean);
			}








		@Override
		public List<RawMaterialorderUpdateDto> getOrderDetailsService() {
			
			return orderObj.getOrderDetailsDao();
			}








		@Override
		public Map<Integer, RawMaterialOrder> getStockdata() {
			// TODO Auto-generated method stub
			return mapOrder;
		}
		
		
		
		
		
		
		
		
		
		

}
