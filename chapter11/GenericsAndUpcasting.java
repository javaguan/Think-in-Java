package chapter11;

import java.util.ArrayList;

class Adddd{}
class Cdddd extends Adddd{}
public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList <Adddd> list=new ArrayList<>();
		Cdddd cdddd=new Cdddd();
		list.add(cdddd);//可以把Adddd的子类放到Adddd的泛型容器内
	}

}
