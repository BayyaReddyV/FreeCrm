package com.crm.qa.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:\\Test.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java");
		
		bw.close();
		
		FileReader fr = new FileReader("D:\\Test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		
		while(s!=null)
		{
			System.out.println(s);
		}
		
	}

}
