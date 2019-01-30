package chapter15;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken <T>{
	private T[]array;
	@SuppressWarnings("unchecked")
	public GenericArrayWithTypeToken(Class<T>type,int sz) {
		array=(T[])Array.newInstance(type, sz);
	}
public void put(int Index,T item) {array[Index]=item;} 
public T get(int index) {return array[index];}
public T[] rep() {return array;}
public static void main(String[] args) {
	GenericArrayWithTypeToken<Integer>gai=new GenericArrayWithTypeToken<>(Integer.class, 10);
	Integer[]ia=gai.rep(); 
}
}
