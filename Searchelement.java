package arraylist;
import java.util.*;

public class Searchelement {

	public static void main(String[] args)
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		if(list_String.contains("Blue"))
		{
			System.out.println("found the element");
		}
		else
		{
			System.out.println("there is no such element");
		}
			
		

	}

}
