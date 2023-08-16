package com.ty;

import java.util.Scanner;

public class WithOutUsingSplit {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		
		String reverse="";
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
