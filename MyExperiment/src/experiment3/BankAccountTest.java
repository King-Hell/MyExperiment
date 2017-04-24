package experiment3;

//此程序作为测试
import java.util.Scanner;
import java.util.Random;

public class BankAccountTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		// 下面是创建第一个银行账户的过程
		System.out.println("======================================================");
		System.out.print("请设置随机数上限：");
		double upper = scan.nextDouble();
		System.out.print("测试开始\n请输入用户名：");
		String username = scan.next();
		System.out.print("请输入账号：");
		int number = scan.nextInt();
		System.out.print("请输入账户余额：");
		double balance = scan.nextDouble();
		System.out.println("==================================");

		BankAccount a = new BankAccount(username, number, balance);
		System.out.println("下面开始模拟第一位用户：\n用户名：" + a.username + "，账号：" + a.number + "，余额：" + a.getBalance());
		for (int i = 1; i <= 8; i++) {
			int testType = random.nextInt(4);
			double money = random.nextDouble() * upper;
			System.out.println("模拟第" + i + "次交易：");
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
		// 下面是创建第二个账户的过程
		System.out.println("======================================================");
		System.out.print("请设置随机数上限：");
		upper = scan.nextDouble();
		System.out.print("测试开始\n请输入用户名：");
		username = scan.next();
		System.out.print("请输入账号：");
		number = scan.nextInt();
		System.out.print("请输入账户余额：");
		balance = scan.nextDouble();
		scan.close();
		System.out.println("==================================");
		BankAccount b = new BankAccount(username, number, balance);
		System.out.println("下面开始模拟第一位用户：\n用户名：" + b.username + "，账号：" + b.number + "，余额：" + b.getBalance());

		for (int i = 1; i <= 8; i++) {
			int testType = random.nextInt(4);
			double money = random.nextDouble() * upper;
			System.out.println("模拟第" + i + "次交易：");
			if (testType == 0) {
				b.deposit(money);
			} else if (testType == 1) {
				b.withdraw(money);
			} else if (testType == 2) {
				System.out.println("您的余额为：" + b.getBalance());
			} else if (testType == 3) {
				b.addinterest();
			}
		}
		System.out.println("=================================================");

	}

}
