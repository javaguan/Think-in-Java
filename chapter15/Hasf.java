package chapter15;

public class Hasf {
public void f() {System.out.println("Hasf.f()");}
}
class Manipulator<T extends Hasf>{
	private T obj;
	public Manipulator(T x) {obj=x;}
	public void manipulate() {obj.f();}//T��obj��û��˵��������f()��������ͨ��������
    //��������T��Hasf����������
}