package pac1;

import java.util.*;



class Main{

public static void main (String[] args) {
ArrayOperationsDemo arr=new ArrayOperationsDemo(10);
arr.insertInEnd(20);
arr.insertInEnd(13);
arr.insertAtIndex(17,1);
arr.insertAtIndex(18,1);
arr.tranversal();
System.out.println("Deleted element at end"+arr.deleteInEnd());
arr.tranversal();
System.out.println("is 17 present: "+arr.serach(17));
System.out.println("is 13 present: "+arr.serach(13));
arr.sort();
arr.tranversal();



}

}
