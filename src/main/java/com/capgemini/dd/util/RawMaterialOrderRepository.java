package com.capgemini.dd.util;

import java.util.*;
import com.capgemini.dd.dao.*;
import com.capgemini.dd.dto.RawMaterialOrder;

public class RawMaterialOrderRepository 
{
	
	public static final Map<Integer,RawMaterialOrder> orderMap = new LinkedHashMap<Integer,RawMaterialOrder>();
	
	
	static 
	{
		orderMap.put(1,new RawMaterialOrder("OR001","Coke","KKDSUP1",50.0,25.0,"02/14/2020","04/14/2020",20.0,25000.0,"Packing","KKD045"));
		orderMap.put(2,new RawMaterialOrder("OR002","Pepsi","KKDSUP6",50.0,25.0,"02/14/2020","04/14/2020",20.0,25000.0,"Packing","KKD045"));
		orderMap.put(3,new RawMaterialOrder("OR003","Fanta","RJYSUP6",50.0,25.0,"02/14/2020","04/14/2020",20.0,25000.0,"Packing","KKD045"));
		
	}
public static Map<Integer,RawMaterialOrder> getData()
{
	return orderMap;
		
	
	
	}
	
}
  