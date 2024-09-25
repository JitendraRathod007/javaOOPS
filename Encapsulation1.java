class Employee
{
	private int id;
	private String name;
    private String city;
    private	double percentage;

    // setter method to set the data
    public void setId(int id)
    {
		this.id=id;
	}
    public void setName(String name)
    {
		this.name=name;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setPercentage(double percentage)
	{
		this.percentage=percentage;
	}

    // getter method to get tha data
    public int getId()
    {
		return id;
	}
	public String getName()
	{
		return name;
     }
     public String getCity()
     {
		 return city;
	 }
	 public double getPercentage()
	 {
		 return percentage;
	 }
}
	 // mainclass
	 class Encapsulation1
	 {
		 public static void main(String args[])
		 {
			 Employee e1=new Employee();
			 e1.setId(11);
			 e1.setName("sagar");
			 e1.setPercentage(98.9);

			 System.out.println("ID:"+e1.getId());
			 System.out.println("Name:"+e1.getName());
			 System.out.println("City:"+e1.getCity()); // by default null
			 System.out.println("Percentage:"+e1.getPercentage());

		 }
	 }


































