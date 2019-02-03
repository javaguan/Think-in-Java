package chapter18;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
public static void main(String[] args)throws IOException {
	StringReader stringReader=new StringReader(BufferedInputFile.read("MemoryInput.java"));
int c;
	while((c=stringReader.read())!=-1) {
		System.out.print((char)c);
	}
}
	
	
}
