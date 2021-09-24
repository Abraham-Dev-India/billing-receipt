package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class Item {

	
	static int totalcost = 0;
	private int cost;
	private String ItemName;
	private String Category;
	static HashMap<String,Integer> productDetails = new HashMap<String,Integer>();
	
	public Item(int cost, String ItemName) {
		this.ItemName = ItemName;
	}
	
    static int demo(String itemName, int cost) {
		Item i = new Item(cost,itemName);
		productDetails.put(itemName, cost);
		
		
		return totalcost = totalcost + cost;
    	
	}
    
  

	public static void main(String[] args) {
		
		int moneyInHand = 20;
		
		
		System.out.println("Welcome to the billing section");
		System.out.println("Enter number of items:");
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		
		int noOfItems = sc.nextInt();
		
		for(int i = 0 ; i<noOfItems; i++) {
		
		System.out.print("Enter Itemname: ");
		String itemName = sc.next();
		
		System.out.println("Enter Cost: ");
		int cost = sc.nextInt();
		
		
		totalcost = demo(itemName,cost);
		
		
		}

		
		int change = moneyInHand - totalcost;
		
		System.out.println("Purchased product details:");
		for(String product :productDetails.keySet()) {
			System.out.println(product + ":" + productDetails.get(product));
		}
		
		System.out.println("TotalCost: " + totalcost);
		System.out.println("Change: " + change);
		
		
}

	
}
