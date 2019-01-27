package chapter11;

import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id=counter++;
	public long id() {return id;}
	
}

public class ApplesAndOrangesWithoutGenerics {
public static void main(String []args) {
	ArrayList<Apple> apples =new ArrayList<>();
	for(int i=0;i<3;i++)apples.add(new Apple());

	for(int j=0;j<apples.size();j++)
		System.out.println(((Apple)apples.get(j)).id());
}
}
