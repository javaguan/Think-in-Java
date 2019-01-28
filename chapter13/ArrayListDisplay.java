package chapter13;

import java.util.ArrayList;
import java.util.Arrays;

//容器类覆盖了String方法用来适应自己
public class ArrayListDisplay {
public static void main(String[] args) {
	ArrayList<String>arrayList=new ArrayList<>(Arrays.asList("one","two","three","four"));
	System.out.println(arrayList);
}
}
