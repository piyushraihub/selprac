package AllImp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Priya");
		l.add("Lima");
		l.add("Surbhi");
		
//		for(String s:l) {
//			System.out.println(s);
//		}
		
		
//		for(int i=0;i<l.size();i++) {
//			System.out.println(l.get(i));
//		}
	
	
	Iterator<String> itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	
	}

}
