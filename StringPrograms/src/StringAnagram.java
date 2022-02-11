import java.util.Arrays;

public class StringAnagram {



	public static void main(String[] args) {
		
        String str1="Brag is";
		
		String str2="Grabb  IS";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
		//check the length of the string
		
		
		if(str1.length()!=str2.length()) {
			
			System.out.println("both Strings are not angram");
			
		}
		else {
			// convert into char Array
		char a[]=str1.toCharArray();	
		
		char b[]=str2.toCharArray();
			
		
		//sort Arrays
	
		   Arrays.sort(a);  
           Arrays.sort(b);  
		
		
       	//comparing both using built in function
		
           if(Arrays.equals(a,b)==true) {
        	   
           System.out.println("both are anagaram");
           
           }
           
           else {System.out.println("both are not anagram");}
           }       
	}

}
