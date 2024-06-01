import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class UnivercityDeserial
{
	public static void main(String[] args) throws IOException ,FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fos=new FileInputStream("D:\\Programming\\cybersuccess\\SerializationAndDeserialization\\StudentData.txt");	
		ObjectInputStream ois=new ObjectInputStream(fos);
		Object obj =ois.readObject();	// Object is return type	-- upcasting Student --> Object
		Student stud=(Student)obj;		// Downcasting Object --> Student
		System.out.println("Roll no. is "+stud.rollNo+" "+"And name is "+stud.studName);
	}
}

//public ObjectInputStream(InputStream in) throws IOException
//public final Object readObject() throws IOException, ClassNotFoundException