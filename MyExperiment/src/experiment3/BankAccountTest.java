package experiment3;

//�˳�����Ϊ����
import java.util.Scanner;
import java.util.Random;

public class BankAccountTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		// �����Ǵ�����һ�������˻��Ĺ���
		System.out.println("======================================================");
		System.out.print("��������������ޣ�");
		double upper = scan.nextDouble();
		System.out.print("���Կ�ʼ\n�������û�����");
		String username = scan.next();
		System.out.print("�������˺ţ�");
		int number = scan.nextInt();
		System.out.print("�������˻���");
		double balance = scan.nextDouble();
		System.out.println("==================================");

		BankAccount a = new BankAccount(username, number, balance);
		System.out.println("���濪ʼģ���һλ�û���\n�û�����" + a.username + "���˺ţ�" + a.number + "����" + a.getBalance());
		for (int i = 1; i <= 8; i++) {
			int testType = random.nextInt(4);
			double money = random.nextDouble() * upper;
			System.out.println("ģ���" + i + "�ν��ף�");
			if (testType == 0) {
				a.deposit(money);
			} else if (testType == 1) {
				a.withdraw(money);
			} else if (testType == 2) {
				System.out.println(a.getBalance());
			} else if (testType == 3) {
				a.addinterest();
			}
		}
		// �����Ǵ����ڶ����˻��Ĺ���
		System.out.println("======================================================");
		System.out.print("��������������ޣ�");
		upper = scan.nextDouble();
		System.out.print("���Կ�ʼ\n�������û�����");
		username = scan.next();
		System.out.print("�������˺ţ�");
		number = scan.nextInt();
		System.out.print("�������˻���");
		balance = scan.nextDouble();
		scan.close();
		System.out.println("==================================");
		BankAccount b = new BankAccount(username, number, balance);
		System.out.println("���濪ʼģ���һλ�û���\n�û�����" + b.username + "���˺ţ�" + b.number + "����" + b.getBalance());

		for (int i = 1; i <= 8; i++) {
			int testType = random.nextInt(4);
			double money = random.nextDouble() * upper;
			System.out.println("ģ���" + i + "�ν��ף�");
			if (testType == 0) {
				b.deposit(money);
			} else if (testType == 1) {
				b.withdraw(money);
			} else if (testType == 2) {
				System.out.println("�������Ϊ��" + b.getBalance());
			} else if (testType == 3) {
				b.addinterest();
			}
		}
		System.out.println("=================================================");

	}

}
