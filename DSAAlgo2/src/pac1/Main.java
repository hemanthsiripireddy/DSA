package pac1;

import java.util.*;



class Main{

public static void main (String[] args) {
DynamicArray arr=new DynamicArray(3);
arr.insert(11);
arr.insert(24);
arr.insert(39);
arr.insert(45);
arr.display();
System.out.println("\ndeleted value: "+arr.delete(1));
arr.display();


}

}
