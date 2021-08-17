package com.objectorientedprograms;


public class InventoryDataValue {
	public static void main(String[] args) {
		String item1 = "Rice";
        int price1=20;
        int weight1=100;

        String item2 = "Pulses";
        int price2=30;
        int weight2=150;

        String item3 = "Wheats";
        int price3=50;
        int weight3=80;
        Inventory[] invent=new Inventory[3];
        invent[0]= new Inventory(item1,weight1,price1);
		invent[1]= new Inventory(item2,weight2,price2);
		invent[2]= new Inventory(item3,weight3,price3);
		
		for(int i=0;i<invent.length;i++) {
			System.out.println("\n"+invent[i]);
		}
	}
}
