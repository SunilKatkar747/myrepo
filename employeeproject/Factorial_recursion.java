
public class Factorial_recursion {

	 int factorial(int n)
	{
		if(n==0)
			return 1;
		else {
			return(n*factorial(n-1));
		}
	}
	
	public static void main(String[] args) {
		
       int fact=1;
       
        int number=4;
        
        Factorial_recursion f =new Factorial_recursion();
        fact=f.factorial(number);
        //fact=factorial(number);
        System.out.println(" factorial of the number using recursion is "+fact);
	}

}
