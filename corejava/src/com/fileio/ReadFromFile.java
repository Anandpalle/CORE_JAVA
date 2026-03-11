package com.fileio;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException, InterruptedException {

		FileReader fr = new FileReader("C:\\workspace\\javaKeywords.txt");
		int i;
		while ((i = fr.read()) != -1) {
			Thread.sleep(100);
			System.out.print((char) i);
		}
		fr.close();
	}
}
