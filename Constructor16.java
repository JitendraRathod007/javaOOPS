class Mytime
{
	int hours;
	int minuts;
	int seconds;
	Mytime()
	{
		hours=0;
		minuts=0;
		seconds=0;
	}
	Mytime(int h,int m,int s)
	{
		hours=h;
		minuts=m;
		seconds=s;
	}
	void display()
	{
		System.out.println("todays time is:"+hours+" " +minuts+ " " +seconds);
	}
}
class Constructor16
{
	public static void main(String args[])
	{
		Mytime t1=new Mytime();
		Mytime t2=new Mytime(5,30,10);
		t1.display();
		t2.display();

	}
}