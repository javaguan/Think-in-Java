package chapter18;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;




public class BasicFileOutput {
	static String file="BasicFileOutput.out";//,out?
public static void main(String[] args)throws IOException {
	BufferedReader bufferedReader=
			new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
	PrintWriter out=new PrintWriter(new FileWriter(file));
	int lineCount=1;
	String string;
	while((string=bufferedReader.readLine())!=null)out.println(lineCount++ +string);
	out.close();
	System.out.println(BufferedInputFile.read(file));
}
	
}
