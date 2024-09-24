class NAWithR5
{
	int a,b,temp;
	NAWithR5(int a , int b){
	  this.a = a;
	   this.b = b;
   }
    void swap()
	{
		temp=a;
		a=b;
		b=temp;


	}

	public static void main(String args[])
	{
		NAWithR5 d1=new NAWithR5(10,20);
		d1.swap();
		System.out.println(d1.a);
		System.out.println(d1.b);
	}
}