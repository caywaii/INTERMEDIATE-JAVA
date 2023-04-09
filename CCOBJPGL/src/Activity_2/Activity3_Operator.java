package Activity_2;

class Operation{
	public void operator() {
	
	}
}

class Add extends Operation {
	public void operator() {
		System.out.println("The operator use in Additions is +");
	}
}

class Subtract extends Operation {
	public void operator() {
		System.out.println("The operator use in Subtraction is -");
	}
}

class Multiply extends Operation {
	public void operator() {
		System.out.println("The operator use in Multiplication is *");
	}
}


class Divide extends Operation {
	public void operator() {
		System.out.println("The operator use in Division is /");
	}
}
public class Activity3_Operator {

	public static void main(String[] args) {
		Operation plus = new Add();
		Operation minus = new Subtract();
		Operation times = new Multiply();
		Operation divide = new Divide();
		
		plus.operator();
		minus.operator();
		times.operator();
		divide.operator();
	}
}
