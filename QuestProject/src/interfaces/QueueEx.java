package interfaces;
import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		Queue <String> queue=new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		queue.remove("two");
		System.out.println(queue);
		System.out.println("queue size  : "+queue.size());
		System.out.println("queue contains two : "+queue.contains("two"));
		queue.clear();
		Queue <Integer> queue1=new LinkedList<>();
		for(int incr=1;incr<6;incr++) {
			queue1.add(incr);
		}
		System.out.println("Elements of queue"+queue1);
		int removedele=queue1.remove();
		System.out.println("removed element"+removedele);
		System.out.println(queue1);
		int head=queue1.peek();
		System.out.println("head "+head);
		System.out.println(queue1);
		System.out.println("size"+queue1.size());
		int head1=queue1.poll();
		System.out.println("head "+head1);
		System.out.println(queue1);
		System.out.println("size "+queue1.size());
	}

}
