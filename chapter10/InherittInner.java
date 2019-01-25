package chapter10;
class WithInner{
	class Inner{}
}
public class InherittInner extends WithInner.Inner{
// InheritInner(){} Won't compile
	public InherittInner(WithInner inner) {
		inner.super();
	}
	public static void main(String[] args) {
		WithInner withInner=new WithInner();
		InherittInner inherittInner=new InherittInner(withInner);
	}
}
