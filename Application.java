/**
 * application for Shopping cart implementation that uses methods to perform functions 
 * @author jcfarese
 * @version 9/11/2022
 *  
 * Fall 2022 
 */
public class Application {

	//Main method that implements all the methods in the Shopping cart class and returns specific parameters.
	public static void main(String[] args) {
		
		//Creates an instance of a new shopping cart to be used to add items into it
		ShoppingCart<Item> aCart=new ShoppingCart<Item>();
		
		System.out.println("Checking to see if the shopping cart is empty: " + aCart.isEmpty());
		
		System.out.println("The current number of items in the bag is: " + aCart.getCurrentSize() + " item(s)");
		
		//Creates an item and adds it to the shopping cart
		System.out.println("***Adding an item into the shopping cart***");
		Item anItem1 = new Item("Bananas", 250);
		aCart.add(anItem1);
		
		//Checks to see if the shopping cart contains any items
		System.out.println("Checking to see if the shopping cart is empty: " + aCart.isEmpty());
		
		//returns how many items are in the shopping cart
		System.out.println("The current number of items in the bag is: " + aCart.getCurrentSize() + " item(s)");
		
		//Creates an item and adds it to the shopping cart
		System.out.println("***Adding an item into the shopping cart***");
		Item anItem2 = new Item("Grapes", 350);
		aCart.add(anItem2);
		
		//Creates an item and adds it to the shopping cart
		System.out.println("***Adding an item into the shopping cart***");
		Item anItem3 = new Item("Steak", 1200);
		aCart.add(anItem3);
		
		//Creates an item and adds it to the shopping cart
		System.out.println("***Adding an item into the shopping cart***");
		Item anItem4 = new Item("Milk", 450);
		aCart.add(anItem4);
		
		//Creates an item and adds it to the shopping cart
		System.out.println("***Adding an item into the shopping cart***");
		Item anItem5 = new Item("Noodles", 370);
		aCart.add(anItem5);
		
		//Creates an instance of a temp array to be used as a place holder to be able to print what is in the shopping cart
		Object[] tempArray = aCart.toArray();

		System.out.println("The items in the shopping cart are: ");
		System.out.println(tempArray[0]);
		System.out.println(tempArray[1]);
		System.out.println(tempArray[2]);
		System.out.println(tempArray[3]);
		System.out.println(tempArray[4]);
		
		//returns how many items are in the shopping cart
		System.out.println("The current number of items in the bag is: " + aCart.getCurrentSize() + " item(s)");
		
		//Returns the total price of all the items in the shopping cart
		System.out.printf("The total price of all the items in the bag is $%d.%02d\n", aCart.getTotalPrice() / 100, aCart.getTotalPrice() % 100);
		
		//removes the last item in the shopping cart
		System.out.println("***Removing the last item in the shopping cart***");
		aCart.remove();
		
		//returns how many items are in the shopping cart
		System.out.println("The current number of items in the bag is: " + aCart.getCurrentSize() + " item(s)");
		
		//Checks the shopping cart to see if a specific item is in the shopping cart
		System.out.println("Checking to see if the shopping cart contains bananas: " + aCart.contains(anItem1));
		
		//removes a specific item from the shopping cart
		System.out.println("***Removing bananas from the shopping cart***");
		aCart.remove(anItem1);
		
		//Checks the shopping cart to see if a specific item is in the shopping cart
		System.out.println("Checking to see if the shopping cart contains bananas: " + aCart.contains(anItem1));
		
		//Returns how many times a specific item is in the shopping cart
		System.out.println("The bag contains " + aCart.getFrequencyOf(anItem2) + " quantitie(s) of grapes");
		
		//Adds an item to the shopping cart
		System.out.println("***Adding an item into the shopping cart***");
		aCart.add(anItem2);
		
		//Returns how many times a specific item is in the shopping cart
		System.out.println("The bag contains " + aCart.getFrequencyOf(anItem2) + " quantitie(s) of grapes");
		
		//Returns the total price of all the items in the shopping cart
		System.out.printf("The total price of all the grapes in the bag is $%d.%02d\n", aCart.getTotalPrice(anItem2) / 100, aCart.getTotalPrice(anItem2) % 100 );
		
		//Removes all the items from the shopping cart
		System.out.println("***Removing all the items from the shopping cart***");
		aCart.clear();
		
		//returns how many items are in the shopping cart 
		System.out.println("The current number of items in the bag is: " + aCart.getCurrentSize() + " item(s)");
		
	}
	
}//end Application class