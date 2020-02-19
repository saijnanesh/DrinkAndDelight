package com.capgemini.dd.servictest;

import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.service.DisplayOrderDetailsService;
import com.capgemini.dd.util.RawMaterialOrderUpdateRepo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
public class TestDisplayOrderDetailsService {
	RawMaterialOrderUpdateRepo repoObj = new RawMaterialOrderUpdateRepo();
	DisplayOrderDetailsService serviceObj = new DisplayOrderDetailsService();
	@Test
	public void testOrderService()
	{
		List<RawMaterialorderUpdateDto> original = serviceObj.getOrderDetailsService();
		List<RawMaterialorderUpdateDto> expected = repoObj.getOrderDetails();
		assertEquals(expected,original);
	}
}
