package chapter13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
private String name;
private Formatter formatter;
public Turtle(String name,Formatter ff) {
	this.name=name;
	this.formatter=ff;
}
public void move(int x,int y) {
	formatter.format("%s The thrtle is at(%d,%d)\n", name,x,y);
}
public static void main(String[] args) {
	PrintStream out=System.out;
	Turtle tomee=new Turtle("tomee", new Formatter(System.out));
	Turtle catter=new Turtle("catter", new Formatter(out));
	tomee.move(2, 4);
	catter.move(0, 5);
	
	
}
}
