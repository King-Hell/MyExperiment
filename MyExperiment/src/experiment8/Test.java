//测试ArrayList
package experiment8;

public class Test {
	public static void main(String args[]) {
		ArrayList array = new ArrayList();
		array.add("a");
		array.add("b");
		array.add("c");
		System.out.println("add方法测试：" + array);
		array.insert(0, "d");
		array.insert(2, "e");
		array.insert(4, "f");
		System.out.println("insert方法测试：" + array);
		array.delete(0);
		array.delete(1);
		array.delete(2);
		System.out.println("delete方法测试：" + array);
		System.out.println("a的下标为" + array.find("a"));
		System.out.println("b的下标为" + array.find("b"));
		System.out.println("c的下标为" + array.find("c"));
	}
}
