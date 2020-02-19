package com.capgemini.dd.service;

import java.util.Map;

import com.capgemini.dd.dto.RawMaterialOrder;

public interface StockDetailsInterface {
	public  Map<Integer,RawMaterialOrder> getStockdata();
	
}
