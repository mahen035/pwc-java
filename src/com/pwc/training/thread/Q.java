package com.pwc.training.thread;

public class Q {
	
	int n;
	boolean flag = false;
	
	synchronized int get() throws InterruptedException {
		if(!flag)
			wait();
		System.out.println("Got:"+n);
		flag = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) throws InterruptedException {
		if(flag)
			wait();
		this.n = n;
		flag = true;
		System.out.println("Put: "+n);
		notify();
	}

}

// How to create threads? => extend thread class, implement Runnable interface
// How to control thread execution? => join(), isAlive()
// How to synchronize methods? => synchronized keyword with the method
// How to establish inter thread communication? => wait(), notify()
