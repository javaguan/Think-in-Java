package chapter11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroup {
	public static void main(String[] args) {
		ArrayList<Integer>arrayList=new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8));
		//��һ��list������ӵ�ArrayList�Ĺ���������ʼ��arraylist
		for(Integer a:arrayList) {System.out.println(a);}
		Collections.addAll(arrayList, 9,10);//����һ��collection�����һЩԪ�أ�����Ԫ����ӵ�������
		System.out.println("======");
		for(Integer a:arrayList) {System.out.println(a);}
	}

}
