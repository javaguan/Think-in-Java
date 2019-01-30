package chapter15;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {
public static void main(String[] args) {
	

	Byte[]possibles= {1,2,3,4,5,6,7,8};
	Set<Byte>set=new HashSet<>(Arrays.asList(possibles));
	System.out.println(set);
}
}
