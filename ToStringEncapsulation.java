class Person
{
	int id;
	String name;
	double salary;

	public Person()
	{
		System.out.println("By default constructor call");
	}

	public Person(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return  "id:" +id+ "name:"+name+ "salary:"+salary;
	}
}

 class ToStringEncapsulation
 {
	 public static void main(String args[])
	 {
		 Person p=new Person(12,"jitendra",657858);
		 Person p1=new Person();

	    // p.show();
	    System.out.println(p);


	 }
 }










