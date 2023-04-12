package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1=new HashSet<String>();
		
		set1.add("zake");
		set1.add("lily");
		set1.add("nivi");
		set1.add("nivi");
		
		System.out.println(set1);
		//no sorting method in set
		//Collections.sort(set1);
		TreeSet<String> set2=new TreeSet<String>();
		
		set2.add("amma");
		set2.add("akka");
		set2.add("me");
		System.out.println(set2);
		set1.add("sneha");
		ArrayList<String> list=new ArrayList<String>(set1);
		System.out.println(list);
	}

}
