package chapter15;

public class FourTuple <A,B,C,D>extends Threetuple<A, B, C> {
public final D four;
public FourTuple(A a,B b,C c,D d) {
	super(a, b, c);
	four=d;
}
public String toString() {
	return "("+first+","+second+","+third+","+four+")";
}
}
