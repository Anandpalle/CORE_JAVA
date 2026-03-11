package com.fileio;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountVowels {
	public static void main(String... args) throws IOException {
		String msg = "Good Morning !!!";
		FileWriter fw = new FileWriter("C:\\javaTextfiles\\message.txt");
		try (BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(msg);
		}
		try (FileReader fr = new FileReader("C:\\javaTextfiles\\message.txt")) {
			int ch;
			int vowelCount = 0;

			while ((ch = fr.read()) != -1) {
				char c = Character.toLowerCase((char) ch);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				}

			}
			System.out.println("file created successfully!!!");
			System.out.print("no of vowels are :" + vowelCount);
		}

	}
}
