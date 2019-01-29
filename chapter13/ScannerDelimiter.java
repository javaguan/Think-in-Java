package chapter13;

import java.util.Scanner;

public class ScannerDelimiter {
	public static void main(String[] args) {
		
	
Scanner in=new Scanner("1,2,3,4,5");
in.useDelimiter("\\s*,\\s*");
while(in.hasNextInt())System.out.println(in.nextInt());
}
}