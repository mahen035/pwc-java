package com.pwc.training.thread;

public class ProducerConsumer {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
