package interfaces;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
	public static void main(String[] args) {
	Map<String,String>map1=new HashMap<>();
map1.put("a","apple");
map1.put("b","appl");
map1.put("c","app");
map1.put("d","ap");
List<String>key1=new ArrayList<>(map1.keySet()) ;
System.out.println(key1);
List<String>value1=new ArrayList<>(map1.values()) ;
System.out.println(value1);
List entry1=new ArrayList<>(map1.entrySet()) ;
System.out.println(entry1);
	}
}
