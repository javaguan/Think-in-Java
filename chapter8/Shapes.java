package chapter8;

public class Shapes {
	private static RandomShapeGenerator generator=new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] shapes=new Shape[9];
		for(Shape a:shapes) {
			a=generator.next();
			a.draw();
		}
		
	}

}
