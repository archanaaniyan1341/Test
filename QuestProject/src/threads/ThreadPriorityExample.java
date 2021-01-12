package threads;

public class ThreadPriorityExample implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
		try {
			Thread.sleep(1000);
		
	}catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+" has finished execution");
	}

}
