package com.objectorientedprograms;

public class Stock {
	
	public String stockname;
	public int numberofstock;
	public int stockprice;
	public int totalval;
	
	public Stock(String stockname,int numberofstock, int stockprice) {
		this.stockname=stockname;
		this.numberofstock=numberofstock;
		this.stockprice=stockprice;
	}
	
	public int getTotalval() {
		return totalval;
	}
	
	public void setTotalval(int totalval) {
		this.totalval=totalval;
	}
	
	@Override
	public String toString() {
		return "The total value of stock " + stockname + " is "+ totalval;
	}
}
