import java.util.Scanner;

public class CountCharcater {

	
	
	
	public static void main(String[] args) {
		
		//String str=" my nbame is ravi";
		
		String str;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the the string");
		
		str=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				count ++;
				
			}
			
			
		}
		
		
		System.out.println(count);
		
		
		
	}
	
	
	
	
}
