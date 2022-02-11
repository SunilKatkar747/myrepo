import java.util.Scanner;

public class FreqofCharacters {

	public static void main(String[] args) {
//		
//		String str="Sicture perfect";
//		int i,j;
//		int freq[]=new int[str.length()]; //length of string tha is totql freq
//		
//		char []a=str.toCharArray();
//		
//		for(i=0;i<str.length();i++) {
//			 freq[i]=1;
//		  for(j=i+1;j<str.length();j++) {
//			
//			if(a[i]==a[j]) {
//				
//				freq[i]++;
//				
//				a[j]='0';
//			}
//			}
//			
//		}
//		
//		for(i=0;i<freq.length;i++) {
//			
//			if (a[i]!=' '&& a[i]!='0') {
//				
//			    System.out.println(a[i] + "-" + freq[i]);  
//			}
//		}
//		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String str=sc.nextLine();
		
//		str=str.toLowerCase();
		
		char ch;
		for(ch='a';ch<='z';ch++) {
		 int count=0;
		 
		 for(int i=0;i<str.length();i++) {
			 if(ch==str.charAt(i))
			 {
				 count++;
				 
			 }
				
			
		 }

			if (count!=0) {
				System.out.println(ch +" "+count);
				
			}	

		}
		
	
	}

}
