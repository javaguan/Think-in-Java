package chapter15;

public class ArrayOfGeneric {
static final int SIZE=100;
static Generic<Integer>[]gia;
@SuppressWarnings("unchecked")
public static void main(String[]args) {
	gia=(Generic<Integer>[])new Object[SIZE];//这里会抛出类型转换异常
	//gia=(Generic<Integer>[])new Generic[SIZE];
	//System.out.println(gia.getClass().getName());
	//gia[0]=new Generic<Integer>();
	
}
}
