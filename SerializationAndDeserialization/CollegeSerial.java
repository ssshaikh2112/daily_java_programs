import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CollegeSerial
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		Student ss=new Student(101,"Sahil");
		FileOutputStream fos=new FileOutputStream("D:\\Programming\\cybersuccess\\SerializationAndDeserialization\\StudentData.txt");	
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(ss);
	}
	
}

//public FileOutputStream(String name) throws FileNotFoundException
//public ObjectOutputStream(OutputStream out) throws IOException
//public final void writeObject(Object obj) throws IOException
