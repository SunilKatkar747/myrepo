
public class Variable {
// variable is container which holds the value while java program is executed.
// variable is name of memory location .variable is assigned to data type	.
// variable value can be changed	
// there are there variable in java : local,static ,instance
	
	
// Local variable -- the variable inside the body of the method is called , you can only use local variable inside method 
// local varible cannt delclare with static keyword	
	
//Instance variable declared inside the class but outside the body of the method,cant be declare as static

//Static variable--A varible is declared as the static is called the static variable.
// you can create the single copy of the static variable and share it among the all instance of the class.
// memory allocation of the static variable happens only once when class is loaded into memory.	
	
	static int m=10; // static variable
	
	void printValue() {
		
		int num=90;
		System.out.println("value of the local variable"+num);
		System.out.println("value of the static variable"+m);
	}
	
	
	
	public static void main(String[] args) {
		
      int data=50;  // instance variable
      System.out.println("value of the instance variable"+data);
       Variable v=new Variable();
       v.printValue();
       
      
	}

}
