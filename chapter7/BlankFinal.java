package chapter7;

public class BlankFinal {
	private final int j;
	public BlankFinal(){
		j=1;
		System.out.println(j);
	}
public static void main(String[] args) {
	new BlankFinal();
}
}
/*final 没有在域中初始化，则变成blank final，必须在每个constructor中初始化；
//final must be initialized!
//final 修饰方法括号里的参数时，意味着参数引用所指向的对象无法被
 * 更改（指向另一个对象）或参数引用的值（基本类型）不能被更改
 
*/