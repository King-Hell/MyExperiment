//正方形类
package experiment9;

public class Square extends Shape {
	double a = 0;

	public Square(double a, String name) {
		square = a * a;
		circumference = a * 4;
		this.a = a;
		this.name = name;
	}
}
