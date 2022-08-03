package arraylist;

import java.util.*;

public class Getelement {

	public static void main(String[] args)
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		String element=list_String.get(0);
		System.out.println("the first element is="+element);
		String element1=list_String.get(4);
		System.out.println("the fifth element is="+element1);
		

	}

}
