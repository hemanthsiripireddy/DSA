
public class VendingMachineImplementation implements VendingMachine{
	private Item itemSelected;
	private Integer cashInserted;
	public VendingMachineImplementation(Inventory inventory) {
		this.itemSelected=null;
		this.cashInserted=0;
		this.inventory = inventory;
	}

	private Inventory inventory;

	@Override
	public void showAllItemsDetails() {
		// TODO Auto-generated method stub
		this.inventory.showAllItemDetails();
		
	}

	@Override
	public void addItemToInventory(Item item) {
		// TODO Auto-generated method stub
		this.inventory.addItem(item, 1);
		
	}

	@Override
	public void insertCash(int cash) {
		// TODO Auto-generated method stub
		if((int)this.cashInserted==0) {
			this.cashInserted=cash;
		}
		else {
			this.cashInserted+=cash;
		}
		
	}

	@Override
	public void selectItem(String itemName) {
		// TODO Auto-generated method stub
		if(this.inventory.isAvailable(itemName)) {
			this.itemSelected=new Item(itemName,this.inventory.getItemPrice(itemName));
			System.out.println(String.format("The item selected is %s", itemSelected.getItemName()));
		}else {
			System.out.println(String.format("The item %s, doesn't exist in inventory", itemName));
		}
		
	}

	@Override
	public int isChangeMatched() {
		// TODO Auto-generated method stub
		if(itemSelected==null) {
			System.out.println("Please select item first for dispensing");
			return 1;
		}
		if(cashInserted==0) {
			System.out.println("Please insert cash for item to be dispensed");
			return 1;
		}
		int cashRequired=itemSelected.getItemPrice();
		if(cashRequired<=cashInserted) {
			return 0;
			
		}
		else {
			System.out.println(String.format("please insert %d more for the item to dispene from machine", cashRequired-cashInserted));
			return 1;
		}
		
	}

	@Override
	public void dispenseItemAndChange() {
		// TODO Auto-generated method stub
		if(isChangeMatched()==0) {
			System.out.println(String.format("the request item %s is dispatched, please collect %d change", itemSelected.getItemName(),cashInserted-this.itemSelected.getItemPrice()));
			this.inventory.decrementItemCount(itemSelected.getItemName());
			this.itemSelected=null;
			this.cashInserted=0;

		}
		
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		if(cashInserted>0) {
			System.out.println(String.format("please take back the insered cash %d", cashInserted));
		}
		this.itemSelected=null;
		this.cashInserted=0;
		System.out.println("your last transaction is cancelled");
		
	}

}
