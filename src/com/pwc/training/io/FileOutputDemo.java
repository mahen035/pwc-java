package com.pwc.training.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		
		FileOutputStream out = null;
		
		try {
			
			File file = new File("output.txt");
		    if(file.exists())
		    	out = new FileOutputStream(file);
		    else {
		    	//throw FileNotFoundException
		    }
			String str = "Demonstrating File Output Stream";
			
			byte[] b = str.getBytes();
			
			out.write(b);
			
			System.out.println("Successfully written to the file..");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
