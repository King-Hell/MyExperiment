/*
 * 编写程序，实现Hi‐Lo 猜猜游戏程序。
 * 实验描述：从1-1000 中随机选择一个数，反复让用户猜该数字是什么，
 * 直到用户猜对或用户退出为止。
 * 每猜一次告诉用户猜测的结果是对还是过大或是过小。
 * 使用一个标识值确定用户是否想退出。当用户猜对时报告其猜测的次数。
 * 每次游戏结束时询问用户是否想继续玩，直到用户选择结束。
 */
package experiment4;

import java.util.Scanner;

public class Experiment4_2 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 1000 + 1);
		System.out.println("请猜一个1-1000的数：");
		int input;
		int time = 0;
		while (true) {
			input = scan.nextInt();
			time++;
			if (input < random) {
				System.out.println("数小了");
			} else if (input > random) {
				System.out.println("数大了");
			} else if (input == random) {
				System.out.println("恭喜你，答对了！！！你猜了" + time + "次");
				break;
			}
			System.out.println("按N键退出,Y键继续");
			String press = scan.next();
			if (press.equalsIgnoreCase("n")) {
				break;
			} else if (press.equalsIgnoreCase("y")) {
				System.out.println("请再猜一次");
			}
		}
		scan.close();
	}
}