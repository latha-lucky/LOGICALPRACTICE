package com.ty;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		int temp;
		boolean isPrime =true;
		Scanner ip=new Scanner(System.in);
		
		int num=ip.nextInt();
		ip.close();
		 for (int i = 2; i>= num/2; i++) {
	            temp = num%i;
	            if (temp == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if(isPrime) 
	            System.out.println(num + "number is prime");
	            else
	                System.out.println(num + "number is not a prime");
	             
	         
	    }
	 
	

		
	}


