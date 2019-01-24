package chapter7;

public class Art extends Ret {
	public Art() {
		System.out.println("Art constructor");
	}
	public static void main(String[] args) {
		new Art();
	}

}
class Ret extends Tet{
	Ret(){
		System.out.println("Ret constructor");
	} 
}
class Tet{
	public Tet() {
		System.out.println("Tet construtor");
	}
}