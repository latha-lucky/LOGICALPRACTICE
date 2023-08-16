package com.ty;

public class ArmstrongOrNot {
	public static void main(String[] args) {
		
		int c=0;
		int a=0,temp=0;
		int n=153;
		temp=n;
		while(n>0) {
			
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
		
	}

}
