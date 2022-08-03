package arraylist;

import java.util.*;

public class Removeelement {

	public static void main(String[] args) 
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		list_String.remove(3);
		System.out.println("After the removing element"+list_String);
		

	}

}
