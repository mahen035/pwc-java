package com.pwc.training.thread;

public class Producer implements Runnable{
	
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			try {
				q.put(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
