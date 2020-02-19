package com.capgemini.dd.dao;
import java.util.*;
import com.capgemini.dd.exception.*;

import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.util.RawMaterialOrderRepository;

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
	
	
	
	
	
		 
	}