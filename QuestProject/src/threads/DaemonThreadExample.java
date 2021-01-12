package threads;

public class DaemonThreadExample extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread executing..."+Thread.currentThread().getName());
		}else {
			System.out.println("Normal thread executing..."+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		DaemonThreadExample t1=new DaemonThreadExample();
		DaemonThreadExample t2=new DaemonThreadExample();
		t1.setName("t1");
		t2.setName("t2");
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}
