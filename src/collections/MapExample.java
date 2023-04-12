package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> basket= new HashMap<String,Integer>();
		
		basket.put("i1",1);
		basket.put("i2",2);
		basket.put("i3",14);
		basket.put("i5",14);
		basket.put("i4",6);
		System.out.println(basket);
		//(key,value),if key is changed,that value will be updated in that key
		basket.put("i3",3);
		System.out.println(basket);
		basket.remove("i2");
		System.out.println(basket);
		/*basket.put(null, 5);
		System.out.println(basket);
		basket.put("i5", null);
		System.out.println(basket);*/
		
		for(String item:basket.keySet())
		{
			System.out.println("the items : "+item);
			System.out.println("the quantity : "+basket.get(item));
		}
		
		for(int val:basket.values())
		{
			System.out.println("the values :"+val);
		}
		String str="sweta anu nivi anu sweta sneha";
		String[] arr1=str.split(" ");
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		for(String word:arr1)
		{
			if(!map.keySet().contains(word))
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, map.get(word)+1);
			}
		}
		System.out.println("the map is :"+map);
	}

}
