package collectioninterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueSized {
	public static void main(String[] args) {
Queue <String>que=new LinkedBlockingQueue<>(3);
System.out.println(que.offer("one"));
System.out.println(que);
System.out.println(que.offer("two"));
System.out.println(que);
System.out.println(que.offer("three"));
System.out.println(que);
System.out.println(que.offer("four"));
System.out.println(que);

System.out.println(que.add("one"));
System.out.println(que);
System.out.println(que.add("two"));
System.out.println(que);
System.out.println(que.add("three"));
System.out.println(que);
System.out.println(que.add("four"));
System.out.println(que);


}
}