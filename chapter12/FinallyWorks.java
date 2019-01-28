package chapter12;

public class FinallyWorks {
static int count =0;
public static void main(String[] args) {
	try {
		
		return;//try catch块里的return也阻止不了finally块的执行
	
	}
	finally {
		
		System.out.println("must done");
		//finally块里抛出异常会覆盖前面出现的异常，finally块里return会丢失前面的异常
	}
}
	
	
}
