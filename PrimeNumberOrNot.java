package com.ty;

import java.util.Scanner;

public class PrimeNumberOrNot {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int num=ip.nextInt();
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("prime number or not");
		}
		
	}

}
