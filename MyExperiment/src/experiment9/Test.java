//����������
package experiment9;

public class Test {
	public static void main(String args[]) {
		Shape[] test = { new Rectangle(3, 4, "����"), new Square(5, "������"), new Oval(9, 4, "��Բ"), new Round(6, "Բ��"),
				new Hexagon(2, "��������") };
		Sorting.print(test);
		Sorting.squareSort(test);
		System.out.println("=============================================\n���������");
		Sorting.print(test);
		System.out.println("=============================================\n���ܳ�����Ϊ��");
		Sorting.circumferenceSort(test);
		Sorting.print(test);
	}
}
