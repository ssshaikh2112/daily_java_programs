import java.util.StringTokenizer;

class Example28
{
	public static void main(String[] args)
	{
		StringTokenizer st= new StringTokenizer("sahil shaikh , is the , computer engineering , student",","); // print till , in one line and then further ...
		while (st.hasMoreTokens())	//	checks element is present or not
		{
			System.out.println(st.nextToken());		//extract the element	
		}
		
	}
}
//	public StringTokenizer(String str,String delim)
// public boolean hasMoreElements()
// public Object nextElement()

/*
sahil shaikh
 is the
 computer engineering
 student
*/
