package collectioninterface;

import java.util.*;

public class SetCommonOperations {

	public static void main(String[] args) {
		Set <String>vowels=new HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		//cannot inset elements based on set to a index
		System.out.println(vowels);
		Set<String>set=new HashSet<>();
		set.add("o");
		set.add("u");
		//appending set elements to vowels
		vowels.addAll(set);
		System.out.println(vowels);
		//clear example to empty set
		set.clear();
		//size example
		System.out.println("letters set size= "+vowels.size());
		vowels.clear();
		vowels.add("e");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		System.out.println("given set elements contain e or not= "+vowels.contains("e"));
		
	}

}
