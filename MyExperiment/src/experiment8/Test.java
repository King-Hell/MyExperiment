//����ArrayList
package experiment8;

public class Test {
	public static void main(String args[]) {
		ArrayList array = new ArrayList();
		array.add("a");
		array.add("b");
		array.add("c");
		System.out.println("add�������ԣ�" + array);
		array.insert(0, "d");
		array.insert(2, "e");
		array.insert(4, "f");
		System.out.println("insert�������ԣ�" + array);
		array.delete(0);
		array.delete(1);
		array.delete(2);
		System.out.println("delete�������ԣ�" + array);
		System.out.println("a���±�Ϊ" + array.find("a"));
		System.out.println("b���±�Ϊ" + array.find("b"));
		System.out.println("c���±�Ϊ" + array.find("c"));
	}
}
