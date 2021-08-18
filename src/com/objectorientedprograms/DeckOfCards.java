package com.objectorientedprograms;

public class DeckOfCards {
	
	public String[][] playercards = new String[4][9];
	public String[] suit = new String[]{"Clubs","Diamonds", "Hearts", "Spades"}; 
	public String[] rank = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	public String[] allselectcards = new String[52];
	public int position=0;
	
	public DeckOfCards() {
		int players = 4;
		while ( players > 0 ) {
			addplayercards((4-players));
			players--;
		}
	}
	
	public void addplayercards(int i) {
		int k =0;
		while (k!=9) {
			int suitselect = randomsuit();
			int rankselect = randomrank();
			int flag = 0;
			String temp = suit[suitselect] + " of "+ rank[rankselect];
			for(int j = 0;j<allselectcards.length;j++) {
				if ( allselectcards[j] == null ) {
					break;
				}
				else if (allselectcards[j].equals(temp)) {
					flag = 1;
					break;
				}
			}
			if ( flag == 0 ) {
				playercards[i][k]=temp;
				allselectcards[position]=temp;
				position++;
				k++;
			}
		}
		
	}
	
	public int randomsuit() {
		return (int)((Math.random()*10)%4);
	}
	
	public int randomrank() {
		return (int)((Math.random()*10)%13);
	}
	
	public void displayplayerscard() {
		for(int i=0;i<playercards.length;i++) {
			System.out.println("Player " + (i+1) + " cards are: ");
			for(int j=0;j<playercards[i].length;j++) {
				System.out.println(playercards[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		DeckOfCards doc = new DeckOfCards();
		doc.displayplayerscard();
	}
	
}
