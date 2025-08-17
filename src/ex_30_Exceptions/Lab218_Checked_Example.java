package ex_30_Exceptions;

import java.io.FileInputStream;

public class Lab218_Checked_Example {
    public static void main(String[] args) {
        //checked exception - JVM can find before running it
        //FileInputStream fs = new FileInputStream("c://a.txt");

        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }
}
