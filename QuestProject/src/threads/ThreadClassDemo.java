package threads;

public class ThreadClassDemo extends Thread {
	public void run() {
try {		for(int incr=0;incr<100;incr++) {
			System.out.println(incr);
			Thread.sleep(100);
		}
}catch(InterruptedException e) {
	e.printStackTrace();
}
	}
}
