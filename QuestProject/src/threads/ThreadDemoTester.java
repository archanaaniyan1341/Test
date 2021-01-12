package threads;

public class ThreadDemoTester {

	public static void main(String[] args) {
		 ThreadDemo td =new  ThreadDemo();
		 Thread t1=new Thread(td) ;
		 Thread t2=new Thread(td) ;
		 Thread t3=new Thread(td) ;
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
