package arraylist;
import java.util.*;

public class Shuffleelement {

	public static void main(String[] args) 
	{
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println("Before shuffle="+list_String);
		Collections.shuffle(list_String);
		System.out.println("After shuffle="+list_String);
		
	}

}
