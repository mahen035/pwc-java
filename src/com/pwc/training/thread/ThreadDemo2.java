package com.pwc.training.thread;

public class ThreadDemo2 extends Thread{
	
	public ThreadDemo2() {
		super("Demo thread 2"); // new state
		System.out.println("Child thread: "+this);
		start();  //Runnable
	}

	@Override
	public void run() {  // Running
		
		for(int i = 0; i<5; i++) {
			try {
				System.out.println("Child2 thread: "+i);
				Thread.sleep(500); // waiting
			}
			catch(InterruptedException e) {
				System.out.println("Child 2 thread interrupted");
			}
			
			
		}
		System.out.println("Child2 thread exited");
	}

}
