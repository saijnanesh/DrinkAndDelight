package com.capgemini.dd.ui;

import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.exception.InvalidException;
import com.capgemini.dd.service.*;



import java.util.*;
public class ControllerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		DisplayStockDetailsService stockDisp = new DisplayStockDetailsService();
		DisplayOrderDetailsService orderDisp = new DisplayOrderDetailsService();
		PlaceAnOrderService objService = new PlaceAnOrderService();

		
		int key;
		
		Scanner scan = new Scanner(System.in);
		
		
		
				objService.getStockList();
	String name = null;
	String supplierid;
	double quantityvalue;
	String orderid;
	double quantityunit;
	double priceperunit;
	int i=100;
	
	
	
	while(true)
	{   
		int ch;
		System.out.println("Enter 1 to get Stock details \n Enter 2 to place order \n Enter 3 to see order details \n Enter 4 to Stop");
		ch=scan.nextInt();
		scan.nextLine();
		switch(ch)
		{
		case 1:	
			Map<Integer,RawMaterialOrder> orderMap = stockDisp.getStockdata();
			for(Map.Entry<Integer,RawMaterialOrder> map : orderMap.entrySet())
			{
			System.out.println("Key : " + map.getKey() + "Name : " + map.getValue().getName() + " SupplierId : "+ map.getValue().getSupplierId()				+ " QuantityValue : "	+map.getValue().getQuantityValue()+ "QuantityUnit : " + map.getValue().getQuantityUnit() + " pricePerUnit : " + map.getValue().getPricePerUnit());
			}
			
			continue;
		case 2:
			System.out.println("Enter id to place order   : ");
			key=scan.nextInt(); 
			scan.nextLine();
			
				 while(true)
				{
					System.out.println("Enter raw material name   : ");
					name=scan.nextLine(); 
					try {
							if(objService.nameValidation(name))
							{
								break ;
							}
						}
					catch(InvalidException e)
					{
						System.out.println("Name doesnot exsist" + e);
					}
					catch(InputMismatchException e)
					{
						System.out.println("Name should be written in characters" + e);
					}
				}
				 
				 
				 
				 
			 while(true)
			{
				System.out.println("Enter supplierId   : ");
				supplierid=scan.nextLine();
				try
				{			
					if(objService.supplierIdValidation(supplierid, key))
					{
						break ;
					}
				}
				catch(InvalidException e)
				{
					System.out.println("Supplier doesnt supply these materials" + e);
				}
				
			}
			 while(true)
			{
				System.out.println("Enter quantityValue   : ");
				quantityvalue=scan.nextDouble();
				try {
				if(objService.quantityValueValidation(quantityvalue, key))
				{	
					break ;
				}}
				catch(InvalidException e)
				{
					System.out.println("Quantity Value Exceeded" + e);
				}
			}
			
			 while(true)
			{
				System.out.println("Enter quantityunit   : ");
				quantityunit=scan.nextDouble();
				try {
				if(objService.quantityUnitValidation(quantityunit, key))
				{
			break ;
				}
				}
			 catch(InvalidException e)
				{
					System.out.println("Quantity Value Exceeded" + e);
				}
			}
			 while(true)
			{
				System.out.println("Enter the price");
				priceperunit = scan.nextDouble();
				try {
				if(objService.pricePerUnitValidation(priceperunit, key))
				{
					break ;
				}	
				}
				catch(InvalidException e)
				{
					System.out.println("Price value Doesnot match" + e);
				}}
			 
			 while(true)
			{
				StringBuilder sb = new StringBuilder();
				sb.append("raw_");
				sb.append(name);
				sb.append(++i);
				 orderid = sb.toString();
			if(objService.orderIdValidation(name, orderid))
			{
				break ;
			}

			}
			
			  
			  	
					RawMaterialorderUpdateDto bean = new RawMaterialorderUpdateDto();
					

					bean.setName(name);	
					bean.setSupplierId(supplierid);	
					bean.setQuantityValue(quantityvalue);	
					bean.setQuantityUnit(quantityunit);	
					bean.setOrderId(orderid);
					bean.setPricePerUnit(priceperunit);
					
				
			 objService.serviceValidation(bean);
					
				
				
			
			
			
		
				
			
			continue;
				
				case 3: 
					List<RawMaterialorderUpdateDto> orderList = orderDisp.getOrderDetailsService();
					for(int k=0;k<orderList.size();k++)
					{
						System.out.println(orderList.get(k).getOrderId() + " Name : " + orderList.get(k).getName() );
					}
			continue;
		case 4: 
			System.out.println("Thank you for having us!!! ");
			break;
		 
		}
		break;
	}
	
}

	
}