package com.pwc.training.thread;

public class DemoThread1 implements Runnable{
	
	Thread t;
	public DemoThread1() {
		t = new Thread(this, "Demo1 thread"); // new state
		System.out.println("Child thread: "+t);
		t.start();  //Runnable
	}

	@Override
	public void run() {  // Running
		
		for(int i = 0; i<5; i++) {
			try {
				System.out.println("Child1 thread: "+i);
				Thread.sleep(500); // waiting
			}
			catch(InterruptedException e) {
				System.out.println("Child 1 thread interrupted");
			}
			
			
		}
		System.out.println("Child1 thread exited");
	}

}
