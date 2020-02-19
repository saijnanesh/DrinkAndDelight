package com.capgemini.dd.dao;
import java.util.*;

import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.util.RawMaterialOrderUpdateRepo;

public class PlacedOrderDetails {
	
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

