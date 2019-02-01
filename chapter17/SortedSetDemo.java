package chapter17;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;



public class SortedSetDemo {
public static void main(String[] args) {
	SortedSet<String>sortedSed=new TreeSet<>();
	Collections.addAll(sortedSed, "one two three four five six seven eight nine ten".split(" "));
	System.out.println(sortedSed);
	String low=sortedSed.first();
	String high=sortedSed.last();
	System.out.println(low+"  "+high);
	Iterator<String>iterator=sortedSed.iterator();
	for(int i=0;i<=6;i++) {
		if(i==3)low=iterator.next();//low从一个String指向了另一个String(注意此处的逗号)
		if(i==6)high=iterator.next();//
		else iterator.next();	
	}
	System.out.println(low);
	System.out.println(high);
	System.out.println(sortedSed.subSet(low, high));
	System.out.println(sortedSed.headSet(high));
	System.out.println(sortedSed.tailSet(low));
}
}
