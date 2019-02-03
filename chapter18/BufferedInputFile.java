package chapter18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class BufferedInputFile {
public static String read(String filename)throws IOException {
	BufferedReader bufferedReader=new BufferedReader(new FileReader(filename));
	String s;
	StringBuilder stringBuilder=new StringBuilder();
	while((s=bufferedReader.readLine())!=null)stringBuilder.append(s+"\n");
	bufferedReader.close();
	return stringBuilder.toString();
}
public static void main(String[] args) 
		throws IOException{
	System.out.print(read("BufferedInputFile.java"));
}
}
