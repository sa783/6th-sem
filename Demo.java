interface A
{
 int a= 5;
 void display ValueOfA()
 }
interface B
{
int b=6;
void display ValueOfB();
}
 interface C extends A,B{
 int c = 10 ;
 void display ValueOfC();
 }
class Myclass implements C
{
		public void  display ValueOfA()
		{
		system.out.println("the value of a is"+a); 
		}
		public void  display ValueOfB()
		{
		System.out.println("the value of b is"+b);
		}
		public void display ValueOfC()
		{
		System.out.println("the value of c is "+c);
		}
}
public class Demo
{
	public void main (String[]args)
	{ 
		Myclass M = new Myclass();
		M.display ValueOfA();
		M.display ValueOfB();
		M.display ValueOfC();
		}
}	
	