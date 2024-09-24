class Demo
{
	Demo()
	{
		 a=10;
		 b=20;
		System.out.println("Constructor method call");
	}
	int a,b;

	int display()
	{
		System.out.println("display method call");
		return a+b;
	}
}
	class Constructor15
	{
		public static void main(String args[])
		{
			Demo d1=new Demo();

		int ans=d1.display();
		System.out.println(ans);

		}
	}
