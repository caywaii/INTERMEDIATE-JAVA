package LongQuiz1;

class Animal{
	public String Pig() {
		String pig = "The Pig says";
		return pig;
	}
	
	public String Cow() {
		String cow = "The Cow says";
		return cow;
	}
	
	public String Dog() {
		String dog = "The Dog says";
		return dog;
	}
}

class ThePig extends Animal{
	public String PigSound() {
		String soundPig = " Oink!";
		return soundPig;
	}
}

class TheCow extends Animal{
	public String PigSound() {
		String soundPig = " MooO!!";
		return soundPig;
	}
}

class TheDog extends Animal{
	public String PigSound() {
		String soundPig = " Aw! Aw! Aw!!";
		return soundPig;
	}
}
public class TheProgram{
	public static void main(String[] args) {
		ThePig dpig = new ThePig();
		TheCow dcow = new TheCow();
		TheDog ddog = new TheDog();
		
		System.out.println(dpig.Pig() + dpig.PigSound());
		System.out.println(dcow.Cow() + dcow.PigSound());
		System.out.println(ddog.Dog() + ddog.PigSound());
	}

}
