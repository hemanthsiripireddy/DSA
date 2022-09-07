import java.util.HashMap;
import java.util.Map;

public class InventoryImplementation implements Inventory{
	private Map<String,Integer>inventoryPriceMap;
	private Map<String,Integer>inventoryItemCount;
	

	public InventoryImplementation() {
		inventoryPriceMap=new HashMap<>();
		inventoryItemCount=new HashMap<>();
	}

	@Override
	public void addItem(Item item, int count) {
		// TODO Auto-generated method stub
		this.inventoryItemCount.put(item.getItemName(), this.inventoryItemCount.getOrDefault(item.getItemName(), 0)+count);
		this.inventoryPriceMap.put(item.getItemName(), item.getItemPrice());
		
	}

	@Override
	public boolean isAvailable(String itemName) {
		if(this.inventoryItemCount.containsKey(itemName)&&this.inventoryItemCount.get(itemName)>0)
			return true;
		else 
			return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllItemDetails() {
		// TODO Auto-generated method stub
		for(Map.Entry<String, Integer>item:this.inventoryPriceMap.entrySet()) {
			System.out.println(String.format("The Item is %s with price %d and having count %d", item.getKey(),item.getValue(),this.inventoryItemCount.get(item.getKey())));
			
		}
		
	}

	@Override
	public int getItemPrice(String selectedItemName)throws NullPointerException {
		// TODO Auto-generated method stub
		return this.inventoryPriceMap.get(selectedItemName);
	}

	@Override
	public void decrementItemCount(String itemName)throws NullPointerException {
		this.inventoryItemCount.put(itemName, this.inventoryItemCount.get(itemName)-1);
		// TODO Auto-generated method stub
		
	}

}
