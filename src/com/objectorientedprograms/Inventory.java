package com.objectorientedprograms;

class Inventory {
	
	public String itemname;
	public int weight;
	public int priceperkg;
	
	public Inventory(String itemname,int weight ,int priceperkg) {
		this.itemname=itemname;
		this.weight=weight;
		this.priceperkg=priceperkg;
	}
	
	@Override
	public String toString() {
		return "Price of "+ itemname +" per KG is "+
                priceperkg +"\nWeight of "+itemname+ " in inventory is "+ weight +
                "\nValue of "+itemname+ " inventory is "+ (weight*priceperkg);
	}
}

