package Collection;

import java.util.*;

public class EnhancedFor {
	public static void main(String[] args){
		
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		for(int i=0;i<9;i++){
			l1.add("a"+ i);
		}
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1, "a5"));
		
		
//		Set s1 = new HashSet();
//		Set s2 = new HashSet();
//		s1.add("a");
//		s1.add("b");
//		s1.add("c");
//		s2.add("d");
//		s2.add("a");
//		s2.add("b");
//		Set sn = new HashSet(s1);
//		sn.retainAll(s2);
//		Set su = new HashSet(s1);
//		su.addAll(s2);
//		System.out.println(sn);
//		System.out.println(su);
		
//		Set s = new HashSet();
//		s.add("hello");
//		s.add("world");
//		s.add(new Name("f1","f2"));
//		s.add(new Integer(100));
//		s.add(new Name("f1","f2"));
//		s.add("hello");
//		System.out.println(s);
		
//		int [] a = {1, 2, 3, 4, 5};
//		for (int i : a){
//			System.out.println(i);
//		}
//		
//		Collection c = new ArrayList();
//		c.add(new String("aaa"));
//		c.add(new String("bbb"));
//		c.add(new String("ccc"));
//		for(Object o : c){
//			System.out.println(o);
//		}
	}
}
