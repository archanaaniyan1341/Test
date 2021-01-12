package getterandsetter;

public class Getter {
	public void getValueFromGetterAndSetter(GetterAndSetter gs) {
	    int no[];
	    String name[];
	    int price[];
	    int quantity[];
	   no=gs.getItemNo();
	  price=gs.getItemPrice();
	  name=gs.getItemName();
	  quantity=gs.getItemQuantity();
	  for(int i=0;i<no.length;i++) {
	  System.out.println(no[i]+" "+name[i]+" "+price[i]+" "+quantity[i]);
	 }
	}
	public void check() {
		getValueFromGetterAndSetter(Setter.createAndSet());
	}
}
