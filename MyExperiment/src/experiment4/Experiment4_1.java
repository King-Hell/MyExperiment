/*
 * ��д����ʵ��WSAD��������ơ�
 * ������������дһ�����򣬵���������Ϊ��WSAD�����ĸ������е�����һ������Сд�Կɣ���
 * ������Ӧ�ķ��򡣱����û����롰W����������󡱡�
 */
package experiment4;

import java.util.Scanner;

public class Experiment4_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		System.out.println("�밴������WASD��");
		while (start) {
			String press = scan.next().toLowerCase();
			switch (press) {
			case "w":
				System.out.println("��");
				break;
			case "a":
				System.out.println("��");
				break;
			case "s":
				System.out.println("��");
				break;
			case "d":
				System.out.println("��");
				break;
			case "n":
				start = false;
				break;
			default:
				System.out.println("������󣡣�");
			}

			if (start) {
				System.out.println("��WASD������������N������");
			}
			else{
				System.out.println("�������");
			}
		}
		scan.close();
	}
}
