package chapter16;

import java.util.Arrays;
import java.util.Collections;

public class CompType implements Comparable<CompType> {
int i;
int j;
private static int count=1;
public CompType(int n1,int n2) {
	i=n1;
	j=n2;
}
public String toString() {
	String result ="[i="+i+",j="+j+"]";
	if(count++%3==0) result+="\n";
	return result;
	
}
public int compareTo(CompType rv) {
	return (i<rv.i?-1:(i==rv.i?0:1));
}
public static void main(String[] args) {
	CompType compType1=new CompType(1, 3);
	CompType compType2=new CompType(2, 5);
	CompType compType3=new CompType(5, 1);
	CompType compType4=new CompType(3, 8);
	System.out.println(compType1.compareTo(compType2));
	CompType[]array=new CompType[] {compType1,compType2,compType3,compType4};
	System.out.println(Arrays.toString(array));
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	Arrays.sort(array, Collections.reverseOrder());
	System.out.println(Arrays.toString(array));
	Arrays.sort(array,new Comtypecomparator());;
	System.out.println(Arrays.toString(array));
}
}
