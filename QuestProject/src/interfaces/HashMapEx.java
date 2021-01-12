package interfaces;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		Map<String,Integer>vehicles=new HashMap<String,Integer>();
		vehicles.put("Benz", 2);
		vehicles.put("BMW", 5);
		vehicles.put("Audi", 8);
		vehicles.put("Lambo", 3);
		System.out.println("size of map "+vehicles.size());
		for(String key:vehicles.keySet()) {
			System.out.println(key +"-" +vehicles.get(key));
			System.out.println();
		}
		System.out.println("Using iterator");
		Set<String>ref=vehicles.keySet();
		Iterator<String>iter=ref.iterator();
		String s1;
		while(iter.hasNext()) {
			s1=iter.next();
			System.out.println(vehicles.get(s1));
		}
		String searchKey="Audi";
		if(vehicles.containsKey("Audi")) {
			System.out.println("Found total"+vehicles.get(searchKey)+searchKey +"total cars");
		}
		vehicles.clear();
		System.out.println(vehicles.size());
	}

}
