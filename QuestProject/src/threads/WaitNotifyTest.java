package threads;

public class WaitNotifyTest {

	public static void main(String[] args) {
Message msg=new Message("Process it");
Waiter waiter=new Waiter(msg);
new Thread(waiter,"waiter").start();
Notifier notifier=new Notifier(msg);
new Thread(notifier,"Notifier").start();
System.out.println("All the threads are started");
	}
}
