//测试主程序
package experiment9;

public class Test {
	public static void main(String args[]) {
		Shape[] test = { new Rectangle(3, 4, "矩形"), new Square(5, "正方形"), new Oval(9, 4, "椭圆"), new Round(6, "圆形"),
				new Hexagon(2, "正六边形") };
		Sorting.print(test);
		Sorting.squareSort(test);
		System.out.println("=============================================\n按面积排序：");
		Sorting.print(test);
		System.out.println("=============================================\n按周长排序为：");
		Sorting.circumferenceSort(test);
		Sorting.print(test);
	}
}
