class Student 
{
   private  int roll;
   public void  setRoll(int roll)
   {
   this.roll=roll;
   }
   public int getRoll()
   {
   return(roll);
   }
  }
class Demo 
{
	public static void main(String []args)
		{
		Student s = new Student();
		s.setRoll(24);
		int r=s.getRoll();
		System.out.print("Roll="+r);
		}
}		