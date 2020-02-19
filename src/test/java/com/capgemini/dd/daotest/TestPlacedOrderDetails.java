package com.capgemini.dd.daotest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import com.capgemini.dd.dao.PlacedOrderDetails;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.util.RawMaterialOrderUpdateRepo;

public class TestPlacedOrderDetails {
PlacedOrderDetails daoObj = new PlacedOrderDetails();
RawMaterialOrderUpdateRepo repoObj = new RawMaterialOrderUpdateRepo();
@Test
public void viewOrderTest()
{
	List<RawMaterialorderUpdateDto> Original = daoObj.getOrderDetailsDao();
	List<RawMaterialorderUpdateDto> Expected = repoObj.getOrderDetails();
	assertEquals(Expected,Original);
	
}
}
