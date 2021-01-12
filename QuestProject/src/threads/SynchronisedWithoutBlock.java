package threads;

import java.util.Arrays;

class HashMapProcessor implements Runnable {
private String[] strArr=null;
public HashMapProcessor (String[]m) {
this.strArr=m;
}
public String[] getMap() {
	return strArr;
}
@Override
public void run() {
	processArr(Thread.currentThread().getName());
	
}
private void processArr(String thrdName) {
	for(int incr=0;incr<strArr.length;incr++) {
		processSomething(incr);
		addThreadName(incr,thrdName);
	}
}
private void addThreadName(int i,String thrdName) {
	synchronized (this){
	strArr[i]=strArr[i]+ ":"+ thrdName;
	}
}
private void processSomething(int index) {
	try {
		Thread.sleep(index*1000);
	}catch(InterruptedException ie) {
		ie.printStackTrace();
	}
}
}
public class SynchronisedWithoutBlock {
	public static void main(String[] args) {
	String arr[]= {"one","two","three","four","five","six"};
	 HashMapProcessor hmp=new  HashMapProcessor(arr);
	 Thread thread1=new Thread(hmp,"thrd1");
	 Thread thread2=new Thread(hmp,"thrd2");
	 Thread thread3=new Thread(hmp,"thrd3");
	 long start=System.currentTimeMillis();
	 thread1.start();
	 thread2.start();
	 thread3.start();
	 //wait for threads to finish
	 try {
		 thread1.join();
		 thread2.join();
		 thread3.join();
	 }catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	 System.out.println("Time taken="+(System.currentTimeMillis()-start));
	 //check the shared variable value now
	 System.out.println(Arrays.asList(hmp.getMap()));
	}
}
