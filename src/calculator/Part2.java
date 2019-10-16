package calculator;

import java.util.ArrayList;
import java.util.Iterator;

public class Part2
{
	public static void main()
	{
		ArrayList<arra>arr=new ArrayList<arra>();
		
		arra obj1=new arra("ram",2);
		arra obj2=new arra("shyam",3);
		arra obj3=new arra("punit",5);
	   	
		arr.add(obj1);
	   	arr.add(obj2);
	   	arr.add(obj3);
	   	
	   	Iterator ir=arr.iterator();
	   	while(ir.hasNext())
	   	{
	   		System.out.println(ir);
	   	}
	   	
	   	
	}

}
