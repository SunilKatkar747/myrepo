// parameterized constructor
public class Student2 {
     int id;
     String name; 
	 Student2(int id,String name){
		 this.id=id;
		 this.name=name;
		 
	 }
	 
	void displayName(){
		System.out.println("id="+id  +"   name="+name); 
		 
	 }
	
	public static void main(String[] args) {
	
		Student2 s1= new Student2(101, "abc");
		s1.displayName();
		
		
	}

}
