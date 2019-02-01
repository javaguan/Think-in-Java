package chapter17;

import java.util.Iterator;
import java.util.TreeMap;



public class SortedMapDemo {
public static void main(String[] args) {
	TreeMap<Integer, String>treeMap=new TreeMap<>();
	treeMap.put(1, "A");
	treeMap.put(1,"B");
	treeMap.put(1, "C");
	treeMap.put(2, "A");
	treeMap.put(2,"B");
	treeMap.put(2, "C");
	treeMap.put(3, "A");
	treeMap.put(3,"B");
	treeMap.put(3, "C");
	Integer low=treeMap.firstKey();
	Integer high=treeMap.lastKey();
	System.out.println(low);
	System.out.println(high);
	System.out.println(treeMap);
	Iterator<Integer>it=treeMap.keySet().iterator();
	
	
}
}
