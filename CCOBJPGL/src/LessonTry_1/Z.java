package LessonTry_1;

//MultiLevel Inheritance
class X{
	public void methodX() {
		System.out.println("Class X method (from the grandparent class)");
	}
}
class Y extends X{
	public void methodY() {
		System.out.println("Class Y methods (from the parent class)");
	}
}

public class Z extends Y {

	public void methodZ() {
		System.out.println("Class Z method (from the child class)");
	}
	
	public static void main(String[] args) {
		Z obj = new Z();
		 obj.methodX(); 
		 obj.methodY(); 
		 obj.methodZ(); 
	}
}
