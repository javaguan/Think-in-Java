package chapter13;



public class Hex {
public static String format(byte[] b) {
	StringBuilder stringBuilder=new StringBuilder();
	int n=0;
	for(byte a:b) {
		if(n%16==0)stringBuilder.append(String.format("%05X:  ",n));
		stringBuilder.append(String.format("%02x ",a));//String.format return a String
		n++;
		if(n%16==0)stringBuilder.append("\n");
	}
	stringBuilder.append("\n");
	return stringBuilder.toString();
}
public static void main(String[] args) {
	byte[]s= {11,23,37,54,89,123,19,3,45,66,32,45,67,89,6,7,8,9,0,127,123,126,23,4,56,18,104};
	System.out.println(format(s));
}
}
