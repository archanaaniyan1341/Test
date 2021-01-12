package collectioninterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx1 {

	public static void main(String[] args) {
		Queue <String>que1=new LinkedList<>();
		que1.offer("one");
		que1.offer("two");
		System.out.println(que1);
		System.out.println(que1.poll());
		System.out.println(que1);
		System.out.println(que1.poll());
		System.out.println(que1);
		System.out.println(que1.poll());
		System.out.println(que1);
		que1.offer("one");
		que1.offer("two");
		System.out.println(que1);
		System.out.println(que1.remove());
		System.out.println(que1);
		System.out.println(que1.remove());
		System.out.println(que1);
		System.out.println(que1.remove());
		System.out.println(que1);

	}

}
