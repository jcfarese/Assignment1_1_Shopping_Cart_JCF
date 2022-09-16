/** A class of items for sale.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 5.0
*/
public class Item
{
   private String description;
   private int    price;
   
   //creates an item of given entries 
	public Item(String productDescription, int productPrice) 
	{
      description = productDescription;
      price = productPrice;
	} // end constructor
	
	/**Gets the description of the item
	 * 
	 * @return the description of the item
	 */
	public String getDescription() 
	{
      return description;
	} // end getDescription

	
	/**Gets the price of the item
	 *  
	 * @return the price of the item
	 */
	public int getPrice() 
	{
      return price;
	} // end getPrice
	
	
	//Creates a string formatting the price to dollars and cents 
	public String toString() 
	{
		return String.format("%s\t$%d.%02d", description, price / 100, price % 100);
	} // end toString
	
} // end Item Class
