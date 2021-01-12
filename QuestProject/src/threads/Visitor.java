package threads;

import java.util.Random;

public class Visitor extends Thread {
	public int id;
	Random numGen=new Random();
	private Object doneLock;
public int availableCars;
public Visitor(int i,int avCars,Object doneLock) {
	this.id=i;
	this.availableCars=avCars;
	this.doneLock=doneLock;
}
public void run() {
	int r=numGen.nextInt(1000);
	try {
		Thread.sleep(r);
	}catch(InterruptedException e) {
		e.printStackTrace();;	
	}
	testFun();
}

public synchronized void testFun() {
	while(Monitor.availableCars<4) {
		try {
		System.out.println(id+"is available to wait..."+" cars="+availableCars);
		synchronized(doneLock) {
			doneLock.wait();
		}
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}	
	System.out.println(id+"is no longer waiting");
}
}

