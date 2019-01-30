package chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
private Class<T>kind;
public ArrayMaker(Class<T>kind) {this.kind=kind;}
@SuppressWarnings("unchecked")
T[]create(int size){return (T[])Array.newInstance(kind, size);}
//由于编译时的类型擦除，Array.newInstance实际返回的是Object类型的数组 
public static void main(String[] args) {
	ArrayMaker<String>stringMaker=new ArrayMaker<String>(String.class);
	String[]stringArray=stringMaker.create(9);
	System.out.println(Arrays.toString(stringArray));
}
}
