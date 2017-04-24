//ÕıÁù±ßĞÎÀà
package experiment9;

public class Hexagon extends Shape {
	double a;

	public Hexagon(double a, String name) {
		square = 3 / 2 * Math.sqrt(a);
		circumference = 6 * a;
		this.a = a;
		this.name = name;
	}
}
