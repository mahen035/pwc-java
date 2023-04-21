package com.pwc.training.thread;

public class Consumer implements Runnable{
	
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				q.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
