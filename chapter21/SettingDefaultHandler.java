package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SettingDefaultHandler {
public static void main(String[] args) {
	Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExecptionHanlder());
	ExecutorService exec=Executors.newCachedThreadPool();
	exec.execute(new ExceptionThread2());
}
}
