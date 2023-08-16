package com.ty;

import java.util.Scanner;

public class LeftRotationOnArrayElements {
	
	
	public static void main(String[] args) {
		int temp;
		Scanner ip=new Scanner(System.in);
		System.out.println("Java Program to perform right rotation two times");
		System.out.println("Enter the size of array");
		
		int size=ip.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Please give value for index "+ i +" : ");
			
			arr[i]=ip.nextInt();
			
		}
		for(int i=0;i<2;i++) {
			temp=arr[0];
			for(int j=0; j<size-1; j++)
            {
                arr[j]=arr[j+1];
            }
            arr[size-1]=temp;
        }
        System.out.println("Array after two time right rotation");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+"\t");
        }
			
		}
	}


