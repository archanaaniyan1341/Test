package collectioninterface;
import java.util.*;
public class IteratorEx {

static void iteratorDemo() {
		List<String> s1=new ArrayList<>();
		s1.add("Quest");
		s1.add("Infosys");
		s1.add("TCS");
		s1.add("CTS");
		Iterator<String> iter;
		iter=s1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}//end of while loop
	//end of method
}//end of method
	public static void main(String[] args) {
		iteratorDemo();
 }//end of main method
}//end of class