class Institute
{
	int studId;
	String studName;
	static String instituteName = "VDF Latur";
	
	Institute(int studId , String studName)
	{
		System.out.println("Student is Adimiting wait...");
		this.studId=studId;
		this.studName=studName;
	}
	void getStudInfo()
	{
		System.out.println("Student ID is "+studId+" and student name is  "+studName+" of  "+instituteName);
	}
}



class Example8
{
	public static void main(String args[])
	{
		Institute stud1= new Institute(25,"Sahil");
		stud1.getStudInfo();
		Institute stud2= new Institute(26,"Sam");
		stud2.getStudInfo();
	}
}

/*
	Whenever need to store unique data we use non static data members.
	However if data is common to entire apllication we can make the 
	members as static by nature.
*/