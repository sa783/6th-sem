import java.util.Scanner;
class Sum
{
	private float fn,sn;
	public void setData(float fn,float sn)
	{
	this.fn=fn;
	this.sn=sn;
	}
	public float getSum()
	{
	float  a = fn+sn;
	return(a);
	}
}
 public class Demo2
{
	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	float m=sc.nextfloat();
	System.out.println("enter the second number");
	float n=sc.nextfloat();
	Sum a = new Sum();
	a.setData(m,n);
	float sm=a.getSum();
	System.Out.println("the sum of two number is ="+sm);
	}
}
	