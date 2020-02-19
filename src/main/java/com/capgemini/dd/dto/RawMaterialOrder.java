package com.capgemini.dd.dto;

public class RawMaterialOrder {
private String orderID;
private String name;
private String supplierId;
private double quantityValue;
private double quantityUnit;
private String dateOfOrder;
private String dateOfDelivery;
private double pricePerUnit;
private double totalPrice;
private String deliveryStatus;
private String warehouseID;






public RawMaterialOrder(String orderID, String name, String supplierId, double quantityValue, double quantityUnit,
		String dateOfOrder, String dateOfDelivery, double pricePerUnit, double totalPrice, String deliveryStatus,
		String warehouseID) {
	super();
	this.orderID = orderID;
	this.name = name;
	this.supplierId = supplierId;
	this.quantityValue = quantityValue;
	this.quantityUnit = quantityUnit;
	this.dateOfOrder = dateOfOrder;
	this.dateOfDelivery = dateOfDelivery;
	this.pricePerUnit = pricePerUnit;
	this.totalPrice = totalPrice;
	this.deliveryStatus = deliveryStatus;
	this.warehouseID = warehouseID;
}






public String getOrderID() {
	return orderID;
}






public String getName() {
	return name;
}






public String getSupplierId() {
	return supplierId;
}






public double getQuantityValue() {
	return quantityValue;
}






public double getQuantityUnit() {
	return quantityUnit;
}






public String getDateOfOrder() {
	return dateOfOrder;
}






public String getDateOfDelivery() {
	return dateOfDelivery;
}






public double getPricePerUnit() {
	return pricePerUnit;
}






public double getTotalPrice() {
	return totalPrice;
}






public String getDeliveryStatus() {
	return deliveryStatus;
}






public String getWarehouseID() {
	return warehouseID;
}


}

