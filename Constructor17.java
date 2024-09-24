class Demo
{
	void display(int a,double b)
	{
		System.out.println(" int float called");
	}
	void display(double a,int b)
		{
			System.out.println("float int called");
	}

}
class Constructor17
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.display(10,10);
		d1.display(10,10);
	}
}
// this will give error ncs both method can store the value hence it is not possible to execute both method at a time.