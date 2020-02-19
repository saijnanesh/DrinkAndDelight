package com.capgemini.dd.service;

import java.util.Map;

import com.capgemini.dd.dao.PlaceAnOrderDao;

import com.capgemini.dd.dto.RawMaterialOrder;


public class DisplayStockDetailsService implements StockDetailsInterface {
	PlaceAnOrderDao orderObj = new PlaceAnOrderDao();
	Map<Integer,RawMaterialOrder> orderMap = orderObj.getDataDao();	
	
	public  Map<Integer,RawMaterialOrder> getStockdata()
	{
		return orderMap;
	}
	
}
