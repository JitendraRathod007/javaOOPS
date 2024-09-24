class FirstDigit7
{
	int first(int n)
	{
		while(n>=10)
		n=n/10;
		return n;
	}
	public static void main(String args[])
	{
		FirstDigit7 d1=new FirstDigit7();
		System.out.println(d1.first(96542));
	}
}