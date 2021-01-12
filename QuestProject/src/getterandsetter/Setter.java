package getterandsetter;

import java.util.Scanner;

public class Setter {
	static Scanner sc=new Scanner(System.in);
	static GetterAndSetter createAndSet() {
    int[] ItemNo=new int[4];
    String[] ItemName=new String[4];
    int[] ItemPrice=new int[4];
    int[] ItemQuantity=new int[4];
    for(int incr=0;incr<4;incr++) {
    	ItemNo[incr]=incr+1;
    	ItemName[incr]="Item"+incr+1;
    	ItemPrice[incr]=sc.nextInt();
    	ItemQuantity[incr]=sc.nextInt();
    }
    GetterAndSetter gs = new GetterAndSetter();
    gs.setItemName(ItemName);
    gs.setItemNo(ItemNo);
    gs.setItemPrice(ItemPrice);
    gs.setItemQuantity(ItemQuantity);
    return gs;
  }
}
