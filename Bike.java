
public class Bike {
// constructor in java--it is block of the code similar to the method.it is called when instance is created.
// at the time of the constructor memory for the object is allocated in the memory.
// it calls default constructor if there is no constructor is available in the class.
// Constructor name should be the same as the name of the class
// constructor does not have any return type
// constructor cannot be abstract,static ,final	
// constructor can be overloaded	
	
	
	Bike() {
	  System.out.println("this is the default constructor is getting called when the instance of the object is created" );	
	} 
	public static void main(String[] args) {
		Bike b=new Bike();
		

	}

}
