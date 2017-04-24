//Õ÷‘≤¿‡
package experiment9;

public class Oval extends Shape {
	double a = 0, b = 0;

	public Oval(double a, double b, String name) {
		square = Math.PI * a * b;
		circumference = Math.PI * 2 * b + 4 * (a - b);
		this.a = a;
		this.b = b;
		this.name = name;
	}
}
