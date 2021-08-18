package com.objectorientedprograms;

import java.util.Scanner;

public class InventoryDataValue {
	
	public Inventory[] invent;
	
	public InventoryDataValue() {
		invent = new Inventory[3];
		for(int i =0 ;i<invent.length;i++) {
			addgrains(i);
		}
	}
	
	public void addgrains(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item name : ");
		String item = sc.nextLine();
		System.out.println("Enter weight");
		int weight = sc.nextInt();
		System.out.println("Enter price per kg:");
		int price = sc.nextInt();
		invent[i] = new Inventory(item,weight,price);
	}
	
	public void displayvalue() {
		for(int i=0;i<invent.length;i++) {
			System.out.println("\n"+invent[i]);
		}
	}
	
	public static void main(String[] args) {
		InventoryDataValue inventdata = new InventoryDataValue();
		inventdata.displayvalue();
	}
}
