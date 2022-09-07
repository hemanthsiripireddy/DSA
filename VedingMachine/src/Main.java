import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory=new InventoryImplementation();
		Item coke=new Item("Coke",45);
		Item pepsi=new Item("Pespi",35);
		Item popCorns=new Item("popcorns",20);
		Item biscuits=new Item("biscuits",20);
		inventory.addItem(biscuits, 23);
		inventory.addItem(popCorns, 25);
		inventory.addItem(coke, 34);
		inventory.addItem(pepsi, 23);
		VendingMachine machine=new VendingMachineImplementation(inventory);
		Scanner sc=new Scanner(System.in);
		showMenu();
		
		int choice=sc.nextInt();
		while(choice!=6){
			switch(choice){
				case 1:{machine.showAllItemsDetails();
				break;}
				case 2:{
					System.out.println("Enter the item for selection");
					String item=sc.next();
					machine.selectItem(item);
					break;
				}
				case 3:{
					System.out.println("Enter the cash amount");
					int cash=sc.nextInt();
					machine.insertCash(cash);
					break;
				}
				case 4:{
					machine.dispenseItemAndChange();
					break;
				}
				case 5:{
					machine.cancelTransaction();
					break;
				}
				case 6:
					break;
				
			}
			showMenu();
			 choice=sc.nextInt();
		}
				

	}
	public static void showMenu() {
		System.out.println("\n Enter any choice from below for vending machine operations");
		System.out.println("1:display all item with count");
		System.out.println("2: Select item");
		System.out.println("3: Insert cash");
		System.out.println("4: dipense item and change");
		System.out.println("5: cancel transaction");
		System.out.println("6:exit");
	}
	

}
