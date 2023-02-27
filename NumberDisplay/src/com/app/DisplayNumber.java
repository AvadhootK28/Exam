package com.app;

import java.util.Scanner;

public class DisplayNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("factorial is " +numberdisplay(num));
		
		
	}
	
	public static int numberdisplay(int num) {
		if(num == 0)
			return 1;
		
		return num * numberdisplay(num - 1) ;
	}

}
