package chapter13;

public class Rudolph {
public static void main(String[] args) {
	for(String s:new String[] {"Rudolph","[Rr]udolph","[Rr][aeiou][a-z]ol.*","R.*"})
		System.out.println("Rudolph".matches(s));
}
	
}
