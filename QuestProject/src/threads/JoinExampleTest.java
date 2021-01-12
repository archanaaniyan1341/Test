package threads;

public class JoinExampleTest {

	public static void main(String[] args) {
		JoinExample t1=new JoinExample();
		t1.setName("t1");
		JoinExample t2=new JoinExample();
		t2.setName("t2");
		JoinExample t3=new JoinExample();
		t3.setName("t3");
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		System.out.println("abc");
	}

}
