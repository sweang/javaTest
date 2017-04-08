package Collection;

import java.util.*;

public class TestIterator {
	public static void main(String[] args){
		Collection c = new HashSet();
		
		c.add(new Name("fff1","lll1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("fff3","lll3"));
		for(Iterator i = c.iterator();i.hasNext();){
			Name name = (Name) i.next();
			if(name.getFirstName().length()<3){
				i.remove();
			}
		}
		System.out.println(c);
		
//		c.add(new Name("f1","l1"));
//		c.add(new Name("f2","l2"));
//		c.add(new Name("f3","l3"));
//		Iterator i = c.iterator();
//		while(i.hasNext()){
//			Name n = (Name) i.next();
//			System.out.print(n.getFirstName() + " ");
//		}
	}
}
