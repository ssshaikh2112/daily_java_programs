class Employee
{
	private int empId;			// not access outside the class
	private String empName;		// not access outside the class
	
	Employee(int empId , String empName)
	{
		this.empId=empId;			// this keyword return the address of current object 
		this.empName=empName;		// this keyword return the address of current object 
	}

	//Getters --> public get Services
	public int getEmpId()
	{
		return empId;		// Copy of original value -->int
	}
	//Getters --> public get Services
	public String getEmpName()
	{
		return empName;		// Copy of original value -->String
	}
}

class Example1
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(101 , "Sahil");		// 2 parameters Constructor
		int eId=emp1.getEmpId();
		String eName = emp1.getEmpName();
		System.out.println("ID of Employee is "+eId+" and Employee name is "+eName);

		Employee emp2 = new Employee(102 , "Akki");
		eId=emp2.getEmpId();
		eName = emp2.getEmpName();
		System.out.println("ID of Employee is "+eId+" and Employee name is "+eName);

	}
}