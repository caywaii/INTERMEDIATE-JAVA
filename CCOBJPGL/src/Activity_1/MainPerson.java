package Activity_1;

public class MainPerson {
	public static void main(String[] args) {
		Person myObj = new Person();
		myObj.setName("John");
		System.out.println(myObj.getName());	
	}
}

class Person{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
}