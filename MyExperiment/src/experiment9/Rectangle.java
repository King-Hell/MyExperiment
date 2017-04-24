//æÿ–Œ¿‡
package experiment9;

public class Rectangle extends Shape {
	double a = 0, b = 0;

	public Rectangle(double a, double b, String name) {
		square = a * b;
		circumference = a + a + b + b;
		this.a = a;
		this.b = b;
		this.name = name;
	}
}
