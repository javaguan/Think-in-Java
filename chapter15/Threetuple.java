package chapter15;

public class Threetuple <A,B,C>extends TwoTuple<A, B>{
public final C third;
public Threetuple(A a, B b, C c){
	super(a,b);
	third=c;
}
public String toString() {
	return "("+first+","+second+","+third+")";
}
}
