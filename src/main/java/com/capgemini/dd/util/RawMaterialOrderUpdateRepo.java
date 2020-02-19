package com.capgemini.dd.util;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;

import java.util.*;

public class RawMaterialOrderUpdateRepo {
	
	RawMaterialorderUpdateDto obj = new RawMaterialorderUpdateDto();
	
public static List<RawMaterialorderUpdateDto> orderUpdate = new ArrayList<RawMaterialorderUpdateDto>();

Map<String,List<RawMaterialorderUpdateDto>> orderMap = new LinkedHashMap<String,List<RawMaterialorderUpdateDto>>();

	
	
	public  List<RawMaterialorderUpdateDto>  getOrderDetails()
	{
	return orderUpdate;	
	}
	
	public void setOrderDetails(RawMaterialorderUpdateDto bean)
	{
	
		
		orderUpdate.add(bean);
		
	
}}

