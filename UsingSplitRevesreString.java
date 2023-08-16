package com.ty;

import java.util.Scanner;

public class UsingSplitRevesreString {
	
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		
		String [] str2=str.split("");
		for(int i=str2.length-1;i>=0;i--) {
			System.out.print(str2[i]);
		}
	}

}
