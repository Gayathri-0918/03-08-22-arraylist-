package arraylist;

import java.util.*;

public class Updateelement {

	public static void main(String[] args) 
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		list_String.set(0,"Blue");
		System.out.println(list_String);

	}

}
