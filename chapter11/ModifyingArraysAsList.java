package chapter11;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;


public class ModifyingArraysAsList {
public static void main(String[] args) {

	Integer[]integers= {1,2,3,4,5,6,7,8,9} ;
	List<Integer>list=new ArrayList<>(Arrays.asList(integers));
	System.out.println("before shuffling:"+list);
	Collections.shuffle(list);
	System.out.println("After shuffling "+list);
	System.out.println("=======");
	System.out.println("array:"+Arrays.toString(integers));
	List<Integer>list2=Arrays.asList(integers);
	System.out.println("before shuffling:"+list2);
	Collections.shuffle(list2);
	System.out.println("After shuffling "+list2);
	System.out.println("=======");
	System.out.println("array:"+Arrays.toString(integers));
}
}
