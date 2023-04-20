package com.pwc.training.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("input.txt");
			
			int i = 0;
			while((i=in.read())!= -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
