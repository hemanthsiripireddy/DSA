
public interface Inventory {
	public void addItem(Item item,int count);
	public boolean isAvailable(String itemName);
	public void showAllItemDetails();
	public int getItemPrice(String selectedItemName);
	public void decrementItemCount(String itemName);

}
