package com.capgemini.dd.ui;

import com.capgemini.dd.dto.RawMaterialOrder;
import com.capgemini.dd.dto.RawMaterialorderUpdateDto;
import com.capgemini.dd.exception.InvalidException;
import com.capgemini.dd.service.*;

import java.time.LocalDate;
import java.util.*;
public class ControllerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ServiceInterface objService = new PlaceAnOrderService();
		RawMaterialorderUpdateDto bean = new RawMaterialorderUpdateDto();
		
		
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
			System.out.println(" Enter 1 to get Stock details \n Enter 2 to place order \n Enter 3 to see order details \n Enter 4 to Stop");
			ch=scan.nextInt();
			scan.nextLine();
			switch(ch)
			{
				case 1:	
					Map<Integer,RawMaterialOrder> orderMap = objService.getStockdata();
					for(Map.Entry<Integer,RawMaterialOrder> map : orderMap.entrySet())
					{
						System.out.println("Key : " + map.getKey() + "   Name : " + map.getValue().getName() + " SupplierId : "+ map.getValue().getSupplierId()				+ " QuantityValue : "	+map.getValue().getQuantityValue()+ "QuantityUnit : " + map.getValue().getQuantityUnit() + " pricePerUnit : " + map.getValue().getPricePerUnit());
					}
					System.out.println(" ");
			
					continue;
				case 2:
					System.out.println("Enter id to place order   : ");
					int id =scan.nextInt();
					key=id-1;
					scan.nextLine();
					while(true)
					{
						System.out.println("Enter raw material name   : ");
						name=scan.nextLine(); 
						try 
						{
							if(objService.nameValidation(name))
							{
								break ;
							}
						}
						catch(InvalidException e)
						{
							System.out.println("Name doesnot exsist" );
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
						 System.out.println("Supplier doesnt supply these materials" );
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
						 System.out.println("Quantity Value Exceeded" );
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
						 System.out.println("Quantity Value Exceeded" );
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
					
					System.out.println("Price value Doesnot match" );
				}
			 }
			 
			 while(true)
			{
				StringBuilder generateId = new StringBuilder();
				generateId.append("raw_");
				generateId.append(name);
				generateId.append(++i);
				orderid = generateId.toString();
			if(objService.orderIdValidation(name))
			{
				break ;
			}

			}
			LocalDate expectedDeliveryDate =  objService.addDeliveryDate();
			double totalPrice = quantityvalue * quantityunit * priceperunit;
			  	
			bean.setName(name);	
			bean.setSupplierId(supplierid);	
			bean.setQuantityValue(quantityvalue);	
			bean.setQuantityUnit(quantityunit);	
			bean.setOrderId(orderid);
			bean.setPricePerUnit(priceperunit);
			bean.setExpectedDeliveryDate(expectedDeliveryDate);
			bean.setTotalPrice(totalPrice);
			objService.serviceValidation(bean);
					
			continue;
				
			case 3: 
				List<RawMaterialorderUpdateDto> orderList = objService.getOrderDetailsService();
					for(int k=0;k<orderList.size();k++)
						{
							System.out.println(orderList.get(k).getOrderId() + " Name : " + orderList.get(k).getName() +" expectedDeliveryDate  :"  +
							orderList.get(k).getExpectedDeliveryDate() + " price  :  " + orderList.get(k).getTotalPrice());
						}
					System.out.println(" ");
			continue;
		case 4: 
			System.out.println("Thank you for having us!!! ");
			break;
		 
		}
		break;
	}
	
}

	
}