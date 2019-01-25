package chapter10;
class MNA{
	private void f() {System.out.println("Mna");}
	class A{
		private void g() {System.out.println("A");}
		public class B{
			void h() {
				System.out.println("B");
				g();
				f();
			}
		}
	}
}
public class MultiNestingAccess {
public static void main(String[] args) {
	MNA mna=new MNA();
	MNA.A mnaa=mna.new A();
	MNA.A.B mnnaab=mnaa.new B();
	mnnaab.h();
}
}
