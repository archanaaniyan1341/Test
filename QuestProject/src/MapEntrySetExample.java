import java.util.*;
public class MapEntrySetExample {

	public static void main(String[] args) {
		Map<String,String>companies=new HashMap<String,String>();
		companies.put("Quest", "Tvm");
		companies.put("Infosys", "Mysore");
		companies.put("TCS", "Chennai");
		companies.put("CTS", "Banglore");
		companies.put("Oracle", "US");
		System.out.println(companies);
		//Getting map entry elements using entry set
		Set<Map.Entry<String,String>> company=companies.entrySet();
		//looping the set of Map.Entry values
		for(Map.Entry<String,String> entry:company) {
			System.out.println("Key is "+entry.getKey()+" value is "+entry.getValue());
			
		}
		System.out.println("Using iterator");
		//Set<Map.Entry<String,String>> companySet=companies.entrySet();
		Iterator<Map.Entry<String,String>>iter=company.iterator();
		while(iter.hasNext()) {
			Map.Entry<String,String>entry=iter.next();
			System.out.println("Key is "+entry.getKey()+" value is "+entry.getValue());
		}
	}

}
