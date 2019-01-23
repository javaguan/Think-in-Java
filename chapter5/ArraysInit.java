package chapter5;

import java.util.Arrays;

public class ArraysInit {
	public static void main(String[] args) {
		Integer[]integers= {new Integer(1),new Integer(2),3};//3 Aotoboxing
		Integer[]integers2=new Integer[] {new Integer(1),new Integer(2),3};
		System.out.println(Arrays.toString(integers));
		System.out.println(Arrays.toString(integers2));
	}

}
