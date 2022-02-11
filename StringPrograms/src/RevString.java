
public class RevString {

	public static void main(String[] args) {
		
		String str="aba";
		
		String Rstr=" ";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			
			Rstr=Rstr+str.charAt(i);
		}
		
		
		System.out.println("Original string is "+str);
		System.out.println("revese string is "+Rstr);
		

		

	}

}
