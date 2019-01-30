package chapter15;



public class GenericArray<T>{
private T[]array;
@SuppressWarnings("unchecked")
public GenericArray(int size) {
	array=(T[])new Object[size];
}
public static void main(String[] args) {
	GenericArray<Integer>gai=new GenericArray<Integer>(10);
}
}
