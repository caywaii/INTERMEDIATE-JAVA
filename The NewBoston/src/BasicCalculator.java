import java.util.*;
public class BasicCalculator {
	
	static Scanner bucky = new Scanner(System.in);
	public static void main(String[] args) {
		double fnum, snum, answer;
		System.out.println("Enter First Number: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter Second Number: ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
	}
}
