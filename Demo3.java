import java.util.Scanner;
class Rectangle
{
	private int len,bre;
	public void setData(int len,int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	public int getArea();
	{
		return(len*bre);
	}
}
class Demo3
{ 
public void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the lenth and breadth");
	int len = sc.nextint();
	int bre= sc.nextint();
	Rectangle r=new Rectangle();
	r.setData(len,bre);
	int res=r.getArea();
	System.out.println("area of rectangle is="+res);
}
}