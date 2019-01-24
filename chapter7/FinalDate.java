package chapter7;

import java.util.Arrays;

public class FinalDate { 
private final int[]a= {1,3,4,6,6,7,8};
public static void main(String[] args) {
	FinalDate finalDate=new FinalDate();
	System.out.println(Arrays.toString(finalDate.a));
	//int []b=new int[] {3,4,67,32};
  //  finalDate.a=b;(a is final,can't point another array object)
	finalDate.a[0]=2333;//but it can be changed;
    System.out.println(Arrays.toString(finalDate.a));
}
}
