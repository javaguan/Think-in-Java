package chapter12;

public class ExceptionSilences {
	
public static void main(String[] args) {
	try {
		throw new RuntimeException();
	}
	finally {
		return;
	}
}
}
