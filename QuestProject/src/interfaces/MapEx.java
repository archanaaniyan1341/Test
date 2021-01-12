package interfaces;
import java.util.Map.Entry;
import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		Map<String,String> data=new HashMap<>();
		data.put("A", "a");
		data.put("B", "b");
		data.put("C", "c");
		data.put("D", "d");
		System.out.println(data.put(null, "z"));
		System.out.println(data.put(null, "p"));
		System.out.println(data.put(null, "q"));
		data.put("R", null);
		System.out.println("Contents of map");
		System.out.println(data);
		String value=data.get("C");
		System.out.println("Key=C Value="+value);
		value=data.getOrDefault("P", "defaultValue");
		System.out.println("Key=P Value="+value);
		boolean keyexists=data.containsKey(null);
		boolean valueexists=data.containsValue(null);
		System.out.println("keyexists= "+keyexists +"valueexists"+valueexists);
		Set<Entry<String,String>>entrySet=data.entrySet();
		System.out.println(entrySet);
		System.out.println("Data map size= "+data.size());
		Map<String,String> data1=new HashMap<>();
		data1.putAll(data);
		System.out.println(data1);
		String nullKeyValue=data1.remove(null);
		System.out.println("data1 null key value="+nullKeyValue);
		System.out.println("after removing"+data1);
		Set<String>keySet=data.keySet();
		System.out.println("DATA MAP KEYS="+keySet);
		Collection<String>values=data.values();
		System.out.println("data values"+values);
		data.clear();
		System.out.println("data size"+data.isEmpty());
	}

}
