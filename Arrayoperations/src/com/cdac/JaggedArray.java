package com.cdac;

public class JaggedArray {

	public static void main(String[] args) {
	//int a[][]={{4,6},{3,8,2},{4,5,9,7}};
		
/*
	for (int i=0;i<a.length;i++){
		    
		    for(int j=0;j<a[i].length;j++)
		    
		      System.out.print(a[i][j]+" ");
		    System.out.println();
		    
		} 
		
*/
//	for(int i[]:a) {
//		for(int k:i) {
//			
//			System.out.print(" "+k);
//			
//		}
//		System.out.println();
//	}
	
//	int num=5;
//	int fact = 1;
//	for(int i=1;i<=num;i++) {
//		fact=fact*i;
//		
//	}
//	System.out.println(fact);
		
//		int a[]= {4,7,89,43,45,5};
//		for(int i=0;i<a.length;i=i+2) {
//			
//			System.out.println(a[i]);
//		}
//		
		
		
		String s="hello";
		char[] ch=s.toCharArray();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}

}
