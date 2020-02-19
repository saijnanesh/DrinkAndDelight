package com.capgemini.dd.service;

import java.util.List;

import com.capgemini.dd.dao.PlacedOrderDetails;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;

public class DisplayOrderDetailsService implements OrderDetailsInterface {
	PlacedOrderDetails orderDao = new PlacedOrderDetails();
	
	public List<RawMaterialorderUpdateDto> getOrderDetailsService()
	{
		return orderDao.getOrderDetailsDao();
	 
	}
	
	
	
}
