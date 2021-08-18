package com.objectorientedprograms;
import java.util.Scanner;

public class StockAccount {
	
	public Scanner sc = new Scanner(System.in);
	public CompanyShares[] companyshare;
	public int[] buyshares;
	public int[] sellshares;
	
	public StockAccount() {
		System.out.println("Enter number of companies: ");
		int company = sc.nextInt();
		companyshare = new CompanyShares[company];
		buyshares = new int[company];
		sellshares = new int[company];
		for(int i=0;i<company;i++) buyshares[i]=0;
		for(int i=0;i<company;i++) sellshares[i]=0;
		addcompanydetails();
		
	}
	
	public void addcompanydetails() {
		for(int i=0;i<companyshare.length;i++) {
			System.out.println("Enter Company Symbol: ");
			String dummy = sc.nextLine();
			String symbol = sc.nextLine();
			System.out.println("Enter Total company shares: ");
			int totalcomshares = sc.nextInt();
			companyshare[i] = new CompanyShares(symbol, totalcomshares);
		}
	}
	
	public void buy(String Companysymbol,int Totalcompanyshares) {
		for(int i=0;i<companyshare.length;i++) {
			if (companyshare[i].Companysymbol.equals(Companysymbol)) {
				if (Totalcompanyshares <= companyshare[i].Totalcompanyshares) {
					System.out.println("You purchased " + Totalcompanyshares + " of " + Companysymbol);
					System.out.println("To save Transaction Press 1. else 2.");
					int choice = sc.nextInt();
					if ( choice == 1 )save("buy",i,Totalcompanyshares);
					else break;
				}
			}
		}
	}
	
	public void sell(String Companysymbol,int Totalcompanyshares) {
		for(int i=0;i<companyshare.length;i++) {
			if (companyshare[i].Companysymbol.equals(Companysymbol)) {
				if ((Totalcompanyshares >= companyshare[i].Totalcompanyshares) && (buyshares[i] >= Totalcompanyshares)) {
					System.out.println("You sold " + Totalcompanyshares + " of " + Companysymbol);
					System.out.println("To save Transaction Press 1. else 2.");
					int choice = sc.nextInt();
					if ( choice == 1 )save("sell",i,Totalcompanyshares);
					else break;
				}
				else {
					System.out.println("You don't have Enough shares to sell.");
					break;
				}
			}
		}
	}
	
	public void save(String name,int i,int Totalcompanyshares) {
		if (name.equals("buy")) {
			buyshares[i] += Totalcompanyshares;
			companyshare[i].Totalcompanyshares -= Totalcompanyshares;
		}
		else {
			sellshares[i] -= Totalcompanyshares;
			buyshares[i] -= Totalcompanyshares;
			companyshare[i].Totalcompanyshares += Totalcompanyshares;
		}
	}
	
	public void stockprint() {
		System.out.println();
		for(int i=0;i<companyshare.length;i++) {
			System.out.println("You purchased "+ buyshares[i] + " in " + companyshare[i].Companysymbol);
			System.out.println("You sold "+ Math.abs(sellshares[i]) + " in " + companyshare[i].Companysymbol);
			System.out.println("Total remaining shares in " + companyshare[i].Companysymbol +" are " + companyshare[i].Totalcompanyshares);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockAccount sa = new StockAccount();
		int flag = 0;
		while (true) {
			System.out.println("Enter 1.Buy 2.Sell 3.Print Report 4.Exit app");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter company symbol:");
				String buydummy = sc.nextLine();
				String buysymbol = sc.nextLine();
				System.out.println("Enter number of shares to buy:");
				int buy1 = sc.nextInt();
				sa.buy(buysymbol,buy1);
				break;
			case 2:
				System.out.println("Enter company symbol:");
				String selldummy = sc.nextLine();
				String sellsymbol = sc.nextLine();
				System.out.println("Enter number of shares to sell:");
				int sell1 = sc.nextInt();
				sa.sell(sellsymbol,sell1);
				break;
			case 3:
				sa.stockprint();
				break;
			case 4:
				flag=1;
				break;
			default:
				System.out.println("Enter correct choice");
				break;
			}
			if ( flag == 1 ) break;
			System.out.println();
		}
	}
}
