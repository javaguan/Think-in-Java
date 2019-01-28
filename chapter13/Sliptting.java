package chapter13;

import java.util.Arrays;

public class Sliptting {
public static String knights="then, when you have found the shrubbery, you must "+ 
"Cut down the mightiest tree in throrest... ";
public static void split(String s) {
	System.out.println(Arrays.toString(knights.split(s)));
}
public static void main(String[] args) {
	split(" ");
	split("\\W+");
	split("n\\W+");
}
}
