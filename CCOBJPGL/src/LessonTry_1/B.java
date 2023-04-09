package LessonTry_1;

//Single Inheritance
class A{
	public void methodA() {
		System.out.println("Parent class (superclass) method");
	}
}
public class B extends A{

	public void methodB() {
		System.out.println("Child class (subclass) method");
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.methodA(); //calling super class method
		obj.methodB(); //calling local method
		}
	}
