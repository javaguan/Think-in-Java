package chapter21;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NativeExceptionHandling {
public static void main(String[] args) {
	try {
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}catch(RuntimeException e) {System.out.println("catch!");}//然而还是未捕获异常，并没有用
}
}
