package org.company.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write your name:");
		String name = sc.nextLine();
		System.out.println("Good morning " + name);
		
		sc.close();
	}

}
