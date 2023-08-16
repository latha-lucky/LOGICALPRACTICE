package com.ty;

import java.util.Scanner;

public class NumberOrStringPlindrome {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		String str1=ip.nextLine();
		String reverse="";
		int length;
		length=str1.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str1.charAt(i);
			
		}
		System.out.println("reverse"+reverse);
		
		
	
	if(str1.equals(reverse)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("palindrome or Not");
	
	}
		
	}

}
