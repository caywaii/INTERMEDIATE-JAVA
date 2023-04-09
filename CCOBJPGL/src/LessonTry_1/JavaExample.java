package LessonTry_1;

//Hierarchical Inheritance
class ParentA{
	public void methodA() {
		System.out.println("Method of Class A");
	}
} 

class ChildB extends ParentA{
	public void methodB() {
		System.out.println("Method of Class B");
	}
}

class ChildC extends ParentA{
	public void methodC() {
		System.out.println("Method of class C");
	}
}

class ChildD extends ParentA{
	public void methodD() {
		System.out.println("Method of class D");
	}
}


public class JavaExample {
	public static void main(String[] args) {
		ChildB obj1 = new ChildB();
		ChildC obj2 = new ChildC();
		 ChildD obj3 = new ChildD();
		 obj1.methodA();
		 obj1.methodB();
		 obj2.methodA();
//		 obj2.methodB(); //ERROR
		 obj3.methodA();
//		 obj3.methodC(); //ERROR
	}
}
