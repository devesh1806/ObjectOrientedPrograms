package com.objectorientedprograms;
import java.util.Scanner;

public class StockPortfolio {
	
	public Stock[] stk;
	public Scanner sc = new Scanner(System.in);
	
	public StockPortfolio() {
		System.out.println("Enter number of companies: ");
		int company = sc.nextInt();
		stk = new Stock[company];
		addcompany();
	}
	
	public void addcompany() {
		for(int i=0;i<stk.length;i++) {
			System.out.println("Enter Stock name: ");
			String dummy = sc.nextLine();
			String stock = sc.nextLine();
			System.out.println("Enter number of shares: ");
			int shares = sc.nextInt();
			System.out.println("Enter share price: ");
			int price = sc.nextInt();
			stk[i]=new Stock(stock,shares,price);
			stk[i].setTotalval(price*shares);
		}
	}
	
	public void printreport() {
		int totalsharevalue =0;
		System.out.println();
		for(int i=0;i<stk.length;i++) {
			totalsharevalue += stk[i].getTotalval();
			System.out.println(stk[i]);
		}
		System.out.println();
		System.out.println("The Total Portfolio evaluation is: " +totalsharevalue );
	}
	
	public static void main(String[] args) {
		StockPortfolio spf = new StockPortfolio();
		spf.printreport();
	}
}
