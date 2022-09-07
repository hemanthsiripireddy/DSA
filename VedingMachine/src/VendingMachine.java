
public interface VendingMachine {
	public void showAllItemsDetails();
	public void addItemToInventory(Item item);
	public void insertCash(int cash);
	public void selectItem(String itemName);
	public int isChangeMatched();
	public void dispenseItemAndChange();
	public void cancelTransaction();

}
