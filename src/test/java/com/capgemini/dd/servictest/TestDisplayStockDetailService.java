package com.capgemini.dd.servictest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.service.DisplayStockDetailsService;
import com.capgemini.dd.util.RawMaterialOrderRepository;

public class TestDisplayStockDetailService {
	DisplayStockDetailsService stockObj = new DisplayStockDetailsService();
	RawMaterialOrderRepository repoObj = new RawMaterialOrderRepository();
	@Test
	public void testStockDetails()
	{
		Set<Entry<Integer,RawMaterialOrder>> original = stockObj.getStockdata().entrySet();
		Set<Entry<Integer,RawMaterialOrder>> expected = repoObj.getData().entrySet();
		assertEquals(expected,original);
		
	}
}
