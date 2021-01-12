package threads;

public class ThreadPriorityExampleTest {
	public static Thread T1 , T2 ;

	public static void main(String[] args) {
		ThreadPriorityExample tpe=new ThreadPriorityExample();
		Thread T1=new Thread(tpe);
		Thread T2=new Thread(tpe);
		System.out.println("Default priority of thread is"+T1.getName()+"="+T1.getPriority());
		System.out.println("Default priority of thread is"+T2.getName()+"="+T2.getPriority());
		T1.setPriority(Thread.MAX_PRIORITY-7);
		T2.setPriority(8);
		T1.start();
		T2.start();
		System.out.println("New priority of thread is"+T1.getName()+"="+T1.getPriority());
		System.out.println("New  priority of thread is"+T2.getName()+"="+T2.getPriority());
	}

}
