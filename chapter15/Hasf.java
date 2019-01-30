package chapter15;

public class Hasf {
public void f() {System.out.println("Hasf.f()");}
}
class Manipulator<T extends Hasf>{
	private T obj;
	public Manipulator(T x) {obj=x;}
	public void manipulate() {obj.f();}//T类obj并没有说明其又有f()方法，故通不过编译
    //除非声明T是Hasf或它的子类
}