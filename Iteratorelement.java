package arraylist;

import java.util.*;

public class Iteratorelement {

	public static void main(String[] args)
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		for(String element:list_String) 
		{
			System.out.println(element);
			
		}
		

	}

}
