package collectioninterface;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		Set <String>ex=new TreeSet<>();
		ex.add("A");
		ex.add("S");
		ex.add("C");
		ex.add("P");
		ex.add("E");
		ex.add("F");
		ex.add("Z");
		ex.add("Q");
		ex.remove("B");
		Iterator<String> iter=ex.iterator();
		while(iter.hasNext()) {
			System.out.print("\t"+iter.next());
		}//end of while loop
		System.out.println("\n Tree set size= "+ex.size());
	}

}
