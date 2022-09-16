/**
 * Interface for Shopping cart that describes operations 
 * @author jcfarese
 * @version 9/11/2022
 *  
 * Fall 2022 
 */
public class ShoppingCart<T> implements ShoppingCartInterface<T> {

	private ResizableArrayBag<T> cartBag;
	
	//Creates an empty cart
	public ShoppingCart() {
		cartBag = new ResizableArrayBag<T>();
	}//end ShoppingCart
	
	/**Gets the current size of the cart
	 * 
	 * @return the current size
	 */
	public int getCurrentSize() {
		return cartBag.getCurrentSize();
	}

	/**Checks the bag to see if it is empty
	 * 
	 * @return Will return true if the bag is empty
	 */
	public boolean isEmpty() {
		return cartBag.isEmpty();
	}//end isEmpty

	/**Adds an item to the bag
	 * 
	 */
	public boolean add(T newItem) {
		return cartBag.add(newItem);
	}//end add

	//Removes the last item added to the bag
	public T remove() {
		return cartBag.remove();
	}//end remove

	//Removes a specific item from the bag
	public boolean remove(T anItem) {
		return cartBag.remove(anItem);
	}//end remove

	//Removes all items from the bag
	public void clear() {
		cartBag.clear();
	}//end clear

	/**Checks to see how many times an item shows up in the bag
	 * 
	 * @return will return a number indicating how many times the item appears in the bag
	 */
	public int getFrequencyOf(T anItem) {
		return cartBag.getFrequencyOf(anItem);
	}//end getFrequencyOf

	/**Checks if the bag contains a specific item
	 *
	 * @return will return true if the specific item is in the bag
	 */
	public boolean contains(T anItem) {
		return cartBag.contains(anItem);
	}//end contains

	//Turns the cart into an array
	public T[] toArray() {
		return cartBag.toArray();
	}//end toArray

	/**Gets the total price of all the items in the bag
	 * 
	 * @return gives the total price of all the items added together in the cart an returns it as an int
	 */
	public int getTotalPrice() {
		Object[] cartArray = cartBag.toArray();
		int sum=0;
		
		for(int j=0;j<cartArray.length;j++) {
			Item i = (Item) cartArray[j];
			sum=sum+i.getPrice();		
		}
		
		return sum;
	}//end getTotalPrice

	/**Returns the total price of all the times a specific item appears in the cart
	 * 
	 * @return the price in int
	 */
	public int getTotalPrice(T anItem) {
		
		int sum = ((Item) anItem).getPrice() * getFrequencyOf(anItem);
		return sum;
	}//end getTotalPrice

}//end ShoppingCart Class
