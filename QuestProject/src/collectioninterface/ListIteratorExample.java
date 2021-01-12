package collectioninterface;
import java.util.*;
public class ListIteratorExample {
	static List<String>l1;
	static void createList() {
		l1=new LinkedList<>();
		l1.add("Quest");
		l1.add("Infosys");
		l1.add("TCS");
		l1.add("CTS");
	}//end of create list
	static void traverseList() {
		System.out.println("From top to bottom");
		ListIterator<String> iter;
		iter=l1.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}//end of while loop
		System.out.println("**************");
		System.out.println("From bottom to top");
		while(iter.hasPrevious()){
			System.out.println( iter.previous());
		}//end of while loop
	}//end of traverse list

	public static void main(String[] args) {
		createList();
		traverseList();
	}//end of main method

}//end of class
