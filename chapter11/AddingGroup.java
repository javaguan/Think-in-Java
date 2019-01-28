package chapter11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroup {
	public static void main(String[] args) {
		ArrayList<Integer>arrayList=new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8));
		//将一个list对象添加到ArrayList的构造器来初始化arraylist
		for(Integer a:arrayList) {System.out.println(a);}
		Collections.addAll(arrayList, 9,10);//接受一个collection对象和一些元素，并把元素添加到对象内
		System.out.println("======");
		for(Integer a:arrayList) {System.out.println(a);}
	}

}
