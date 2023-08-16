package com.ty;

import java.util.Scanner;

public class DuplicateStringCharacters {
	
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int c=0;
	
		char [] chars=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++) {
		
			for(int j=i+1;j<=s.length()-1;j++) {
				if(chars[i]==chars[j]) {
					System.out.println(chars[j]);
					c++;
					break;
				}
			}
			
		}
		
	}

}
