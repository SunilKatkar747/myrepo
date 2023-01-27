// default Constructor to set the default value to the variable
public class Student {
	
	int id;
	String name;
	
	void display(){
		System.out.println("id= "+id +"  name ="+name);
	}

	public static void main(String[] args) {
			Student s=new Student();
			s.display();

	}

}
