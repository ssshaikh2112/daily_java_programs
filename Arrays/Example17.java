class Example17
{
	public static void main(String[] args)
	{
		Emp[] emp=new Emp[5];	
		emp[0]=new Emp(101,"Sahil");
		emp[1]=new Emp(102,"Owais");
		emp[2]=new Emp(103,"Navid");

		for (Emp ss:emp)
		{
			if (ss instanceof Emp)	// instanceof :	instanceof keyword is a binary operator used to test if an object (instance) is a subtype of a given Type.
			{
				System.out.println(ss.rollno+" "+ss.name);
			}
			else
			{
				System.out.println("Not value present : "+ss);
			}
		}
	}
}