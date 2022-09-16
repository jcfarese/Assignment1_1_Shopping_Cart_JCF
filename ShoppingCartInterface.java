/**
 * Interface for Shopping cart that describes operations 
 * @author jcfarese
 * @version 9/7/2022
 *  
 * Fall 2022 
 */

public interface ShoppingCartInterface<T> {

	//Gets the current number of items in the shopping cart
	public int getCurrentSize();
	
	/**checks to see if the shopping cart is empty
	 * @return True if the shopping cart is empty, or False if the shopping cart is empty
	 */
	public boolean isEmpty();
	
	/**Adds a new item to the shopping cart
	 * @param newItem is the object to be added
	 * @return True if successful, or False if not
	 */
	public boolean add(T newItem);
	
	//removes the last item added to the shopping cart
	public T remove();
	
	/**removes a specific item from the shopping cart
	 * @param anItem is the object to be removed
	 * @return True if successful, or False if not
	 */
	public boolean remove(T anItem);
	
	//Removes all items from the shopping cart
	public void clear();
	
	/**counts the number of times an item appears in the shopping cart
	 * @param anItem is the object to be counted
	 * @return the number of times the item appears
	 */
	public int getFrequencyOf(T anItem);
	
	/**checks to see if the shopping cart contains a specific item
	 * @param anItem the object that is checked for
	 * @return True if the shopping cart contains the item, or False if not
	 */
	public boolean contains(T anItem);
	
	//Gets all the items in the shopping cart and returns it as an array
	public T[] toArray();
	
	//returns as a string
	public String toString();
	
	//returns the total price of all the items in the shopping cart
	public int getTotalPrice();
	
	/**returns the total price for all the times a specific item appears in the shopping cart
	 * @param anItem to be counted
	 * @return the total price for all the instances of that one item in the shopping cart
	 */
	public int getTotalPrice(T anItem);
	
}//end ShoppingCart Interface