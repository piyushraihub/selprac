package AllImp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {
public static void main(String[] args) {
	
	
	Map<String,Integer> map=new HashMap<String, Integer>();
	
	map.put("Priya", 1);
	map.put("Anjali", 2);
	map.put("Surbhi", 3);
	
//	for(Map.Entry<String, Integer> me : map.entrySet()) {
//		
//		System.out.println(me.getKey() + " "+me.getValue());
//	}
	System.out.println(map);
	Iterator itr=map.entrySet().iterator();
	while(itr.hasNext()) {
		//System.out.println(itr.next());;
		Map.Entry<String, Integer> me=(Map.Entry<String, Integer>)itr.next();
		System.out.println(me.getKey() +" "+me.getValue());
	}
	
}
}
