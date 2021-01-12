package collectioninterface;

import java.util.*;

public class SetExample {
	public static void main(String args[]) {
Set<Integer> s=new HashSet<Integer>();
System.out.println(s.add(10));
s.add(20);
s.add(30);
System.out.println(s.add(10));//to check if the element has been added
s.add(50);

Iterator<Integer> iter;//to print elements using iterator
iter=s.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}//end of while loop
//System.out.println(s);
System.out.println(s.size());
System.out.println(s.isEmpty());
}//end of main method
}//end of class