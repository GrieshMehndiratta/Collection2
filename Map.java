package Collection1;

import java.util.HashMap;
import java.util.Map.Entry;

class Map 
{
	public static void main(String args[]) 
	{
		HashMap<String,Integer> M= new HashMap<String,Integer>();
		
		M.put("A",1);
		M.put("B",2);
		M.put("C",3);
		M.put("D",4);
		M.put("E",5);
		
		for(Entry<String, Integer> i:M.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}