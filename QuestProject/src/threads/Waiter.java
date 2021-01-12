package threads;

public class Waiter implements Runnable{
private Message msg;
public Waiter(Message msg) {
	this.msg=msg;
}
public void run() {
	String name=Thread.currentThread().getName();
	synchronized (msg) {
		try {
			System.out.println(name+" Waiting to get notified at:"+System.currentTimeMillis());
			msg.wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" Waiter thread got notified at:"+System.currentTimeMillis());
		System.out.println(name+" processed message:"+msg.getMsg());
	}
}
}
