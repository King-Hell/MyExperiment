/*
 * ��д����ʵ��Hi�\Lo �²���Ϸ����
 * ʵ����������1-1000 �����ѡ��һ�������������û��¸�������ʲô��
 * ֱ���û��¶Ի��û��˳�Ϊֹ��
 * ÿ��һ�θ����û��²�Ľ���ǶԻ��ǹ�����ǹ�С��
 * ʹ��һ����ʶֵȷ���û��Ƿ����˳������û��¶�ʱ������²�Ĵ�����
 * ÿ����Ϸ����ʱѯ���û��Ƿ�������棬ֱ���û�ѡ�������
 */
package experiment4;

import java.util.Scanner;

public class Experiment4_2 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 1000 + 1);
		System.out.println("���һ��1-1000������");
		int input;
		int time = 0;
		while (true) {
			input = scan.nextInt();
			time++;
			if (input < random) {
				System.out.println("��С��");
			} else if (input > random) {
				System.out.println("������");
			} else if (input == random) {
				System.out.println("��ϲ�㣬����ˣ����������" + time + "��");
				break;
			}
			System.out.println("��N���˳�,Y������");
			String press = scan.next();
			if (press.equalsIgnoreCase("n")) {
				break;
			} else if (press.equalsIgnoreCase("y")) {
				System.out.println("���ٲ�һ��");
			}
		}
		scan.close();
	}
}