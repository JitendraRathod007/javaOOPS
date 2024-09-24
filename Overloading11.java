class Overloading11
{
    void display()
    {
		System.out.println(" without parameter display method call");
	}
	void display(int a,int b)
	{
		System.out.println("two parameter method call");
	}
	int display(int a,double b)
	{
		//System.out.println("diff para data type method called");
	    return 5;
	}
	public static void main(String args[])
	{
		Overloading11 ov=new Overloading11();
		int ans = ov.display(12,24.7);
		System.out.println(ans);
		ov.display(12,23);
		ov.display();

	}
}
