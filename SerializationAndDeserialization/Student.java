import java.io.Serializable;

class Student implements Serializable
{
	int rollNo;
	String studName;
	Student(int rollNo,String studName)
	{
		this.rollNo=rollNo;
		this.studName=studName;
	}
}