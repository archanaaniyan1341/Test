package collectioninterface;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueEx {

	public static void main(String[] args) {
		Deque <String> deq=new LinkedList<>();
		deq.add("java");
		deq.offerFirst("javascript");
		deq.addFirst("angular");
		deq.addLast("jquery");
		deq.offer("HTML");
		deq.offerLast("css");
		System.out.println("elements of dequeue"+deq);
		System.out.println("first elements of dequeue"+deq.getFirst());
		System.out.println("remove first elements of dequeue"+deq.removeFirst());
		deq.pop();
		System.out.println("first elements of dequeue after removal: "+deq.peekFirst());
		System.out.println("last elements of dequeue"+deq.getLast());
		deq.removeLast();
		System.out.println("remove last elements of dequeue"+deq.peekLast());
		System.out.println("Normal iteration");
		Iterator <String> it1=deq.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("Descending iteration");
		Iterator <String> it2=deq.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		

	}

}
