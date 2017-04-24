package experiment3;
//此程序定义银行账户类
import java.text.DecimalFormat;

public class BankAccount {
	public String username = "无";
	public int number = 0;
	private double balance = 0;
	private final double RATE = 0.015;

	public BankAccount(String username, int number, double balance) {
		this.username = username;
		this.number = number;
		this.balance = balance;

	}

	public void deposit(double money) {
		DecimalFormat fmt = new DecimalFormat("￥#,###.00");
		balance += money;
		System.out.println("存款成功，您的账户已存入" + fmt.format(money) + ",账户余额为：" + fmt.format(balance));
	}

	public void withdraw(double money) {
		DecimalFormat fmt = new DecimalFormat("￥#,###.00");
		if (balance >= money) {
			balance -= money;
			System.out.println("取款成功，您的账户已取出" + fmt.format(money) + ",账户余额为：" + fmt.format(balance));
		} else {
			System.out.println("您的余额不足，取款失败！");
		}
	}

	public String getBalance() {
		DecimalFormat fmt = new DecimalFormat("￥#,###.00");
		return fmt.format(balance);
	}

	public void addinterest() {
		DecimalFormat fmt = new DecimalFormat("￥#,###.00");

		balance *= (1 + RATE);
		System.out.println("加息成功，当前利率为：" + RATE + ",您的余额为：" + fmt.format(balance));
	}
}
