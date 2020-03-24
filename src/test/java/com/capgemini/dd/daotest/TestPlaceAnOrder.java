package com.capgemini.dd.daotest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map.Entry;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.capgemini.dd.dao.PlaceAnOrderDao;
import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.util.RawMaterialOrderRepository;
import com.capgemini.dd.util.RawMaterialOrderUpdateRepo;
public class TestPlaceAnOrder 
{
	
	PlaceAnOrderDao obj = new PlaceAnOrderDao();
	@Test
	public void stockTesting()
	{
	  Set<Entry<Integer,RawMaterialOrder>> original=obj.getDataDao().entrySet();
	  Set<Entry<Integer,RawMaterialOrder>> expected=RawMaterialOrderRepository.getData().entrySet();
 
	  assertEquals(expected,original);
	  
	}
	
	RawMaterialOrderUpdateRepo repoObj = new RawMaterialOrderUpdateRepo();
	@Test
	public void viewOrderTest()
	{
		List<RawMaterialorderUpdateDto> Original = obj.getOrderDetailsDao();
		List<RawMaterialorderUpdateDto> Expected = repoObj.getOrderDetails();
		assertEquals(Expected,Original);
		
	}
}
