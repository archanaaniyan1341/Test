package collectioninterface;
import java.util.*;
public class ListExample {
public static void main(String args[]) {
	List<String> l1=new ArrayList<String>();
	l1.add("one");
	l1.add("two");
	l1.clear();
	l1.add("three");
	l1.add("four");
	System.out.println("ArrayList");
	System.out.println(l1);
	System.out.println("size "+l1.size());
	List<String> l2=new LinkedList<String>();
	l2.add("one");
	l2.add("two");
	l2.add("three");
	l2.add("four");
	System.out.println("LinkedList");
	System.out.println(l2);
	System.out.println("size "+l2.size());
}
}
