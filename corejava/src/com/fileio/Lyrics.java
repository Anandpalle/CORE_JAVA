package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lyrics {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:\\javaTextfiles\\lyrics.txt");
        BufferedReader br = new BufferedReader(fr);

        int ch;
        while ((ch = br.read()) != -1) {
            char c = (char) ch;
            System.out.print(c);

            // Speed control based on character
            if (c == '\n') {
                Thread.sleep(800);        // pause between lines
            } else if (c == '.' || c == '…') {
                Thread.sleep(600);        // dramatic pause
            } else if (c == ',' ) {
                Thread.sleep(300);        // small pause
            } else {
                Thread.sleep(80);         // normal singing speed
            }
        }

        br.close();
        fr.close();
    }
}
