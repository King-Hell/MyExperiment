//排序，面积为选择排序，周长为插入排序
package experiment9;

public class Sorting {
	public static void squareSort(Shape[] list) {
		int min;
		Shape temp;
		for (int index = 0; index < list.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < list.length; scan++) {
				if (list[scan].getSquare() < list[min].getSquare()) {
					min = scan;
				}
			}
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}

	public static void circumferenceSort(Shape[] list) {
		for (int index = 1; index < list.length; index++) {
			Shape key = list[index];
			int position = index;
			while (position > 0 && key.circumference < list[position - 1].circumference) {
				list[position] = list[position - 1];
				position--;
			}
			list[position] = key;
		}
	}

	public static void print(Shape[] list) {
		for (Shape i : list) {
			System.out.println(i);
		}
	}
}
