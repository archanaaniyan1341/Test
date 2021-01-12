package interfaces;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		System.out.println(m1.put(1, "app"));
		m1.put(2, "avp");
		m1.put(3, "arp");
		System.out.println(m1.put(4, "atp"));
		System.out.println(m1.put(1, "ahp"));
		System.out.println(m1.put(5, "app"));
		System.out.println(m1.put(null, "aup"));
		System.out.println(m1.put(null, "arp"));
		
		System.out.println();
		System.out.println("Map elements");
		System.out.println(m1);

	}

}
