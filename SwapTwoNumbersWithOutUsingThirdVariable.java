package com.ty;

import java.util.Scanner;

public class SwapTwoNumbersWithOutUsingThirdVariable {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int x=ip.nextInt();
		int y=ip.nextInt();
		System.out.println("Before swapping"+x+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping"+x+y);
	}

}
