package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args)
	{
		
		String[] names= {"swerta","anu","nivi","reshu"};
		System.out.println(" the secord  name in array is : "+names[2]);
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("anu");
		list.add("sweta");
		list.add("jaya");
		list.add("reshu");
		list.add("nivi");
		list.add("nivi");
		// in array list duplicate will allow but null will not be allow
		System.out.println("sorting :");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.get(list.size()-1));
		list.set(3, "sneha");
	
		list.remove(2);
		list.add(2, "sudha");
		System.out.println("list :"+list);
		System.out.println("*********");
		
		//iterate through list by loop
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("*********");
		//for each loop
		
		for(String value : list)
		{
			System.out.println(value);
		}
		System.out.println("*********");
		list.add("shylan");
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*********");
		//sorting ascending
		Collections.sort(list);
		System.out.println(list);
		//sorting descending
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);

	}

}
