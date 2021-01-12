package threads;

public class JoinExample  extends Thread{
	public void run() {
		for(int incr=1;incr<=5;incr++) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"->"+ incr);
		}
	}

}
