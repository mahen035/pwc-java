package com.pwc.training.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		//InputStreamReader reader = new InputStreamReader(System.in);
		FileReader reader = new FileReader("input.txt");
		
		BufferedReader br = new BufferedReader(reader);
		
		int i;
		
		while((i=br.read())!= -1) {
			System.out.print((char)i);
		}
		//String name = br.readLine();
		
		//System.out.println("Hello "+name+"!");
		

	}

}
