package chapter13;


public class InfiniteRecursion {
public String toString() {
	return "hiahiahia"+this+"\n";//this.String="hiahiahia"+this.toString()+"\n"......toString�����޵ݹ�
}
public static void main(String[] args) {
	InfiniteRecursion infiniteRecursion=new InfiniteRecursion();
	System.out.println(infiniteRecursion.toString());
}
}
