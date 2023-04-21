package com.pwc.training.thread;

public class SharedObject {
	
	public synchronized void sharedMethod(String str) {
		System.out.print("[");
		System.out.print(str);
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}

// [Spirit]
// [of]
// [java]
