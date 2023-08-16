package com.ty;

import java.util.Scanner;

public class FibnoacciSeries {
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		int num=ip.nextInt();
		int a=0,b=0,c=1;
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
			
		}
	}

}
