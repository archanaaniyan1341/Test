package collectioninterface;

import java.util.*;


public class HashSetExample {

	public static void main(String[] args) {
		Set <String>fruits=new HashSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println("fruit set is empty= "+fruits.isEmpty());
		
		System.out.println("fruit contains apple= "+fruits.contains("Apple"));
		System.out.println("fruit contains mango= "+fruits.contains("Mango"));
		
		System.out.println("apples removed from fruit set= "+fruits.remove("Apple"));
		System.out.println("mango removed from fruit set= "+fruits.remove("Mango"));
		
		System.out.println("fruits set size= "+fruits.size());
		
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		
		System.out.println("fruits set before ad all= "+fruits);
		System.out.println(list);
		fruits.addAll(list);
		System.out.println("fruits set after ad all= "+fruits);
		
		Iterator<String> iter=fruits.iterator();
		while(iter.hasNext()) {
			System.out.println("Consuming fruit"+iter.next());
		}//end of while loop
		fruits.add("Orange");
		System.out.println("fruits set before remove all= "+fruits);
		System.out.println(list);
		fruits.removeAll(list);
		System.out.println("fruits set after remove all= "+fruits);
		
		fruits.clear();
		System.out.println("fruit set is empty= "+fruits.isEmpty());
		
		
	}

}
