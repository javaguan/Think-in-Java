package chapter16;

public class ArrayOfGenericType<T> {
T[]array;
@SuppressWarnings("unchecked")
public ArrayOfGenericType(int size) {
	//array=new T[size];
	array=(T[])new Object[size];	
}
}
