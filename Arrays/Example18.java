class Example18
{
	// How can we store Hetrogeneous data in array
	// ANS : Yes in Object class format.

	public static void main(String[] args)
	{
		Object[] obj=new Object[3];
		obj[0]=new Student(101,"Sam");
		obj[1]=new Emp(201,"Sahil");
		obj[2]=(300);
		//System.out.println(obj[2]);
		
		for (Object o:obj)
		{
			if(o instanceof Student)
			{
				Student ss=(Student)o;		// because control is at Object class
				System.out.println(ss.studRollNo+" "+ss.studName);
			}
			else if (o instanceof Emp)
			{
				Emp ee=(Emp)o;				// because control is at Object class
				System.out.println(ee.rollno+" "+ee.name);
			}
			else if (o instanceof Integer)
			{
				Integer ii=(Integer)o;		// because control is at Object class
				System.out.println(ii);
			}
		}
	}
}
// public java.lang.Integer(int);