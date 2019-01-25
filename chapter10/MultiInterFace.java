package chapter10;
interface A{}
interface B{}
class X implements A,B{}
class Y implements A{
	B makeB() {return new B() {};}
}
public class MultiInterFace {

}
