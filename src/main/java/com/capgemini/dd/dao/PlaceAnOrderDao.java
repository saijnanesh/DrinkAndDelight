package com.capgemini.dd.dao;
import java.util.*;
import com.capgemini.dd.exception.*;

import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.util.RawMaterialOrderRepository;
import com.capgemini.dd.util.RawMaterialOrderUpdateRepo;

public class PlaceAnOrderDao 

{

	
	Map<Integer,RawMaterialOrder> orderMap;
	
	
	public PlaceAnOrderDao()
	{
		
		orderMap = RawMaterialOrderRepository.getData();
		
		
	}
	
	
	public Map<Integer,RawMaterialOrder> getDataDao()
	{
		return orderMap;
	}
	
	
	
	RawMaterialOrderUpdateRepo obj = new RawMaterialOrderUpdateRepo(); 
	
	public void addOrderDao(RawMaterialorderUpdateDto bean )
	{
		RawMaterialOrderUpdateRepo rawRepo = new RawMaterialOrderUpdateRepo();
		rawRepo.setOrderDetails(bean);
	}
	
	public List<RawMaterialorderUpdateDto> getOrderDetailsDao()
	{
		
		return obj.getOrderDetails();
	 
	}	

	
	
		 
	}