package com.ty;

import java.util.Scanner;

public class SwapingTwoNumbers {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int x=ip.nextInt();
		int y=ip.nextInt();
		int temp;
		System.out.println("Before Swapping"+x+y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping"+x+y);
		
	}

}
