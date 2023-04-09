package InterfaceLessonTry_1;
interface F
{
 int x=10;
}
interface G
{
 int x=100;
}
public class Hello implements F,G {
	public static void Main(String args[]){
//	 System.out.println(x); 
	 System.out.println(F.x);
	 System.out.println(G.x);
	 }
}
