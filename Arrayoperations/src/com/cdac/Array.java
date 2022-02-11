package com.cdac;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		//int b[]=new int[n+1];
		int c[]=new int [n-1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
	  System.out.println(" Elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");	
		}
	  System.out.println();
//		System.out.println("Enter the index where you want to insert the element ");
//		int m=sc.nextInt();
//		System.out.println("Enter the new value ");
//		int p=sc.nextInt();
//		for(int i=0;i<n+1;i++) 
//		{
//			if(i<m)
//			{
//				b[i]=arr[i];	//insertion operation
//			}
//			else if(i==m){
//				b[i]=p;	
//			}
//			else {
//			b[i]=arr[i-1];	
//				
//			}
//		
//		}
//		
//		System.out.println(" New Array ");
//		
//		for(int i=0;i<n+1;i++) {
//			
//			System.out.print(b[i]+" ");
//		}
		
		System.out.println("Enter the inddx uou want to delete ");
		
		 int s=sc.nextInt();
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(i<s)
				{
					c[i]=arr[i];	
				}
				else if(i==s){
					
					continue;
				}
				else {
				c[i-1]=arr[i];	
					
				}
			 
		 }
			
		
			System.out.println(" New Array ");
			
			for(int i=0;i<n-1;i++) {
				
				System.out.print(c[i]+" ");
			}
		
		
		
		
	}

}
