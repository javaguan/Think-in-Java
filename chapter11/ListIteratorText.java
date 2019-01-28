package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorText {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));
	ListIterator<Integer> listIterator1=list.listIterator(3);
	while(listIterator1.hasNext()) {
		System.out.println(listIterator1.next());
	}
}
	
	
}
