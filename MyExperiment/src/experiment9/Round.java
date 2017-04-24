//‘≤–Œ¿‡
package experiment9;

public class Round extends Shape {
	double r;

	public Round(double r, String name) {
		square = Math.PI * r * r;
		circumference = Math.PI * 2 * r;
		this.r = r;
		this.name = name;
	}
}
