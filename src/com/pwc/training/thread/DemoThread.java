package com.pwc.training.thread;

public class DemoThread implements Runnable{
	
	String name;
	Thread t;
	
	public DemoThread(String name) {
		this.name = name;
		t = new Thread(this, this.name);
		System.out.println("New Thread: "+t);
		t.start();
	}


	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			try {
				System.out.println("Child thread: "+t.getName()+":"+i);
				Thread.sleep(500); // waiting
			}
			catch(InterruptedException e) {
				System.out.println("Child thread interrupted");
			}
			
			
		}
		System.out.println("Child thread exited");
		
	}

}
