package LessonTry_1;

class C
{
 public void disp()
 {
System.out.println("C");
 }
}
class A2 extends C
{
 public void disp()
 {
System.out.println("A");
 }
}
class B2 extends C
{
 public void disp()
 {
System.out.println("B");
 }
}

public class D2 {
	public void disp()
	 {
	System.out.println("D");
	 }
	 public static void main(String args[]){
	D2 obj = new D2();
	obj.disp();
	 }

}
