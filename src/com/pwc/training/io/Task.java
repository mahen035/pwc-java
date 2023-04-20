package com.pwc.training.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task {
	
	public static void main(String args[]) {
		try {
	        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
	        String str;

	        while ((str = in.readLine())!= null) {
	            String[] ar=str.split(",");
	            
	        }
	        in.close();
	    } catch (IOException e) {
	        System.out.println("File Read Error");
	    }
	}

}
