//ͼ�θ���
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
		return name + "  ���Ϊ��" + square + "  �ܳ�Ϊ��" + circumference;
	}
}
