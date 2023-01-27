// static keyword is used to memory efficient management

//static variable will get memory once and retain its value
public class StaticVariable {
		
   int id ;
   String name;
   static String college="KIT"; // static variable
   
   static int count=0;
   
      StaticVariable(int id,String name,String college) {
    	  
    	  this.id=id;
    	  this.name=name;
    	  this.college=college;
    	  
		
	}
   
      
      void displayDetails() {
    	  count ++;
    	  System.out.println( " id="+id +" name="+name+ " college="+college);
    	  System.out.println(count );
      }
	
	

	public static void main(String[] args) {
		
		StaticVariable s=new StaticVariable(101, "abc", college);
		StaticVariable s1=new StaticVariable(102, "xyz", college);
		s.displayDetails();
		s1.displayDetails();;
		 

	}
}
