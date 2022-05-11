package com.softserve.edu13io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
	public static void main(String[] args) {
		System.out.print("0123456789");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print( ((char) 13) + "ABC");
		System.out.println();
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		System.out.print("Input number: ");
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("I/O Error.");
		}
		System.out.println("Number is " + x);
	}

}
