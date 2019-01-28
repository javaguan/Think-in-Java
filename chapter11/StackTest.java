package chapter11;

public class StackTest {
public static void main(String[] args) {
	Stack<String> stack=new Stack<>();
	for(String s:"good good study day day up".split(" ")) {
		stack.push(s);
	}
	while(!stack.isEmpty()) {System.out.println(stack.pop()+"  ");}//每次remove 的是最后一个元素
}
}
