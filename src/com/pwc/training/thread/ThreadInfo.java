package com.pwc.training.thread;

public class ThreadInfo {

	public static void main(String[] args) throws InterruptedException {
		
		SharedObject obj = new SharedObject();
		
		MyThread t1 = new MyThread(obj, "Spirit");
		t1.t.join();
		MyThread t2 = new MyThread(obj, "of");
		t2.t.join();
		MyThread t3 = new MyThread(obj, "Java");
		
		
		
		/*
		 * Thread t = Thread.currentThread(); t.setName("Demo Thread");
		 * t.setPriority(8); System.out.println("Current thread is: "+t);
		 */
		
		//new DemoThread1();
		
		//new ThreadDemo2();
		
		/*DemoThread t1 = new DemoThread("One");
		t1.t.join();
		DemoThread t2 = new DemoThread("Two");
		t2.t.join();
		DemoThread t3 = new DemoThread("Three");*/
		
	//	System.out.println("Thread one is alive: "+t1.t.isAlive());
		
				
		/*
		for(int i = 0; i<5; i++) {
			try {
				System.out.println("Main thread: "+i);
				Thread.sleep(500); // waiting
			}
			catch(InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
			
			
		}
		System.out.println("Main thread exited");
		*/
	}

}

// Creating a thread: 1. extend the Thread class, 2. implementing Runnable interface

// Create two threads one will print table of 5 and the other will print table of 10
// make sure second thread starts only after 1st one terminates

// Synchorization
