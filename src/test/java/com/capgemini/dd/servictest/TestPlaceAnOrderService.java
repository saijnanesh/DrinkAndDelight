package com.capgemini.dd.servictest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.dd.exception.InvalidException;
import com.capgemini.dd.service.PlaceAnOrderService;

public class TestPlaceAnOrderService {
	PlaceAnOrderService obj=new PlaceAnOrderService ();
	@BeforeEach
	public void testStockList()
	{
		obj.getStockList();
	}
	@Test
	
	public void testName()  
	{
		Throwable exception = assertThrows(InvalidException.class, ()->{
			obj.nameValidation("qwertg");
		}	);
		assertEquals("Invalid Name",exception.getMessage());
		
	}
	@Test
	public void testName1() throws InvalidException
	{
	assertTrue(obj.nameValidation("Coke"));
	}
	@Test
	public void testSupplierId()  
	{
		Throwable exception = assertThrows(InvalidException.class, ()->{
			obj.supplierIdValidation("asdfd",2);
		}	);
		assertEquals("Invalid supplier details",exception.getMessage());
	}
	@Test
	public void testSupplierId1() throws InvalidException
	{
	assertTrue(obj.supplierIdValidation("KKDSUP1",0));
	}
	@Test
	public void testQuantityValue()  
	{
		Throwable exception = assertThrows(InvalidException.class, ()->{
			obj.quantityValueValidation(52.0, 0);
		}	);
		assertEquals("Invalid Quantity Value",exception.getMessage());
	}
	@Test
	public void testQuantityValue1() throws InvalidException
	{
	assertTrue(obj.quantityValueValidation(25.0, 0));
	}
	@Test
	public void testQuantityUnit()  
	{
		Throwable exception = assertThrows(InvalidException.class, ()->{
			obj.quantityUnitValidation(26.0, 0);
		}	);
		assertEquals("Invalid Quantity Unit ",exception.getMessage());
	}
	@Test
	public void testQuantityUnit1() throws InvalidException
	{
	assertTrue(obj.quantityUnitValidation(21.0, 0));
	}
	
	@Test
	public void testOrderId1() 
	{
	assertTrue(obj.orderIdValidation("Coke", "raw_Coke101"));
	}
	@Test
	public void testPrice()  
	{
		Throwable exception = assertThrows(InvalidException.class, ()->{
			obj.pricePerUnitValidation(21.0, 0);
		}	);
		assertEquals("Invalid Price",exception.getMessage());
	}
	@Test
	public void testPrice1() throws InvalidException
	{
	assertTrue(obj.pricePerUnitValidation(20.0,0));
	}

}