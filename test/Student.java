package ParameterizedConstructor;
class Student{
	int id;
	String name;
	float marks;
	  Student(int i, String n){
		id=i;
		name=n;
		System.out.println(id+" "+name);
	}
	
	
	Student(int i,String n,Float p){
		id=i;
		name=n;
		marks=p;
		System.out.println(id+" "+name+" "+marks);
	}  
	 void display() {
		System.out.println(id+" "+name+" "+marks);
	}  
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(100,"lavanya",8.5f);
		Student s2=new Student(101,"bhavishya");
		Student s3=new Student(102,"mukesh",9.0f);
		// Student s4=new Student();
		// s4.display();
		s1.display();
		s2.display();
       s3.display();
       // System.out.println(s1.equals(s2));
       // System.out.println(s2.equals(s3));
	}

}
