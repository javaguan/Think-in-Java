package chapter12;

public class ExceptionMethods {
public static void main(String[] args) {
	try {
		throw new Exception("My Exception");
	}catch(Exception e) {
		System.out.println("Caught Exception");
		System.out.println("getMessage():"+e.getMessage());
		System.out.println("printStackTrace:");
		e.printStackTrace(System.err);//System.out��System.err(��׼��������׼������)
		}
		
	

}
}