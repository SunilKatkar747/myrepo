import java.util.Scanner;

public class Swapping_withoutusingthirdvariable {

	public static void main(String[] args) {
//		int a=7;
//		int b=5;
		
		
		// taking input from user
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of the b");
		int b=sc.nextInt();
		
		System.out.println(" value before the swapping a="+a + " b="+b);
		
		
		a=a+b; //12
		
		b=a-b;//12-5=7
		
		a=a-b;//12-7=5
		
		System.out.println("value of the after swapping a="+a + " b="+b);
		

	}

}
