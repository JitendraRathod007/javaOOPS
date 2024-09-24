class NAWRlastNo10
{
	int n;
	int last()
	{
		n=n%10;
		return n;
	}
	public static void main(String args[])
	{
		NAWRlastNo10 d1=new NAWRlastNo10();
		d1.n=345;
		int ans=d1.last();
		System.out.println(ans);
	}
}