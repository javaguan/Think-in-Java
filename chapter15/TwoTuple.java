package chapter15;
//拥有两个对象的元祖
public class TwoTuple <A,B>{
	public final A first;
	public final B second;
	public TwoTuple(A a,B b){
		first=a;
		second=b;
	}
public String toString() {
	return "("+first+","+second+")";
}
}
