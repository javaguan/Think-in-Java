package chapter11;

import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
public static void main(String[] args) {
	Set<Integer>set=new TreeSet<>();
	//Hashset使用了散列一般无序，treeset定为有序
	for(int i=0;i<10;i++) {
		set.add((int)(Math.random()*100));
	}
	System.out.println(set);
	set.add(101);
	System.out.println(set.contains(101));
	System.out.println(set.contains(102));
	
}

}
