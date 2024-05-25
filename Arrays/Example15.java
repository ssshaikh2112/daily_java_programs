class Example15
{
	public static void main(String[] args)
	{
		Emp[] emp=new Emp[5];	// all index are not give its value.
		emp[0]=new Emp(101,"Sahil");
		emp[1]=new Emp(102,"Owais");
		emp[2]=new Emp(103,"Navid");

		for (Emp e:emp)
		{
			System.out.println(e.rollno+" "+e.name);
		}
	}
}
/*
	Exception in thread "main" java.lang.NullPointerException: Cannot read field "rollno" because "<local5>" is null
        at Example15.main(Example15.java:12)
*/