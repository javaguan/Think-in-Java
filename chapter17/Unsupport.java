package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Unsupport {
static void test(String msg,List<String>list) {
	System.out.println("---"+msg+"---");
	Collection< String>c=list;
	Collection<String>sublist=list.subList(1, 8);
	Collection<String>c2=new ArrayList<>(sublist);
	try{c.retainAll(c2);}catch(Exception e) {
		System.out.println("returnAll()"+e);}
	try {c.removeAll(c2);}catch(Exception e) {
		System.out.println("removeAll()"+e);
	}
	try {c.clear();}catch(Exception e) {
		System.out.println("clear()"+e);
	}
	try {c.add("x");}catch(Exception e) {
		System.out.println("add()"+e);
	}
	try {c.addAll(c2);}catch(Exception e) {
		System.out.println("addAll()"+e);
	}
	try {c.remove("C");}catch (Exception e) {
	System.out.println("remove()"+e);
}
	try {list.set(0, "X");}catch(Exception e) {
		System.out.println("List.set()"+e);
	}
}
public static void main(String[] args) {
	List<String>list=Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N,l".split(","));
	test("Arrays.asList", list);
}
}
