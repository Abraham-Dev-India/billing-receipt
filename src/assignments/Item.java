package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class Item {

	
	static int totalcost = 0;
	private int cost;
	private String ItemName;
	private String Category;

	public Item(int cost, String ItemName) {
		this.ItemName = ItemName;
	}
	
    static int demo(String itemName, int cost) {
		Item i = new Item(cost,itemName);
		return totalcost = totalcost + cost;
    	
	}
    
  

	public static void main(String[] args) {
		
		int moneyAtHand = 20;
		//int totalCost = 0;
		HashMap<String,Integer> productDetails = new HashMap<String,Integer>();
		
		System.out.println("Welcome to the billing section");
		System.out.println("Enter number of items:");
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		
		int noOfItems = sc.nextInt();
		
		for(int i = 0 ; i<noOfItems; i++) {
		
		System.out.print("Enter Itemname: ");
		String itemName = sc.next();
		
		System.out.println("Enter Cost: ");
		int cost = sc.nextInt();
		
		productDetails.put(itemName, cost);
		
		totalcost = demo(itemName,cost);
		
		
		}
//		System.out.println("Itemname:" + itemName);
//		System.out.println("Cost: " + cost);
//		System.out.println("Change: " + change);
		
		int change = moneyAtHand - totalcost;
		
		System.out.println("Purchased product details:");
		for(String product :productDetails.keySet()) {
			System.out.println(product + ":" + productDetails.get(product));
		}
		
		System.out.println("TotalCost: " + totalcost);
		System.out.println("Change: " + change);
		
		
}

	
}
