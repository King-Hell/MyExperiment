package experiment3;
//�˳����������˻���
import java.text.DecimalFormat;

public class BankAccount {
	public String username = "��";
	public int number = 0;
	private double balance = 0;
	private final double RATE = 0.015;

	public BankAccount(String username, int number, double balance) {
		this.username = username;
		this.number = number;
		this.balance = balance;

	}

	public void deposit(double money) {
		DecimalFormat fmt = new DecimalFormat("��#,###.00");
		balance += money;
		System.out.println("���ɹ��������˻��Ѵ���" + fmt.format(money) + ",�˻����Ϊ��" + fmt.format(balance));
	}

	public void withdraw(double money) {
		DecimalFormat fmt = new DecimalFormat("��#,###.00");
		if (balance >= money) {
			balance -= money;
			System.out.println("ȡ��ɹ��������˻���ȡ��" + fmt.format(money) + ",�˻����Ϊ��" + fmt.format(balance));
		} else {
			System.out.println("�������㣬ȡ��ʧ�ܣ�");
		}
	}

	public String getBalance() {
		DecimalFormat fmt = new DecimalFormat("��#,###.00");
		return fmt.format(balance);
	}

	public void addinterest() {
		DecimalFormat fmt = new DecimalFormat("��#,###.00");

		balance *= (1 + RATE);
		System.out.println("��Ϣ�ɹ�����ǰ����Ϊ��" + RATE + ",�������Ϊ��" + fmt.format(balance));
	}
}
