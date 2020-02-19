package com.capgemini.dd.daotest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.capgemini.dd.dao.PlaceAnOrderDao;
import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.util.RawMaterialOrderRepository;
public class TestPlaceAnOrder 
{
	
	PlaceAnOrderDao obj = new PlaceAnOrderDao();
	RawMaterialOrderRepository repo=new RawMaterialOrderRepository();
	@Test
	public void stockTesting()
	{
	  Set<Entry<Integer,RawMaterialOrder>> original=obj.getDataDao().entrySet();
	  Set<Entry<Integer,RawMaterialOrder>> expected=repo.getData().entrySet();
 
	  assertEquals(expected,original);
	  
	}
}
