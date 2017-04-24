//图形父类
package experiment9;

public class Shape {
	double square = 0, circumference = 0;
	String name = "";

	public double getSquare() {
		return square;
	}

	public double getCircumference() {
		return circumference;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + "  面积为：" + square + "  周长为：" + circumference;
	}
}
