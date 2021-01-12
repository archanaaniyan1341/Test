package getterandsetter;

public class GetterAndSetter {
	static private int ItemNo[];
	static private String ItemName[];
	static private int ItemPrice[];
	public static void setItemQuantity(int[] itemQuantity) {
		ItemQuantity = itemQuantity;
	}
	static private int ItemQuantity[];
	public static  int[] getItemNo() {
		return ItemNo;
	}
	public static void setItemNo(int[] itemNo) {
		ItemNo = itemNo;
	}
	public static String[] getItemName() {
		return ItemName;
	}
	public static void setItemName(String[] itemName2) {
		ItemName = itemName2;
	}
	public static int[] getItemPrice() {
		return ItemPrice;
	}
	public static  void setItemPrice(int[] itemPrice) {
		ItemPrice = itemPrice;
	}
	public static int[] getItemQuantity() {
		return ItemQuantity;
}
}