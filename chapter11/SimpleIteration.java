package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		Iterator<Integer> iterator=list.iterator();
		int i;
		while(iterator.hasNext()) {
			
			i=iterator.next();
			System.out.println(i);
			iterator.remove();
		}
		System.out.println(list.size());
		
	}

}
