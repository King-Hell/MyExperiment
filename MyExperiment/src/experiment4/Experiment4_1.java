/*
 * 编写程序，实现WSAD”方向控制。
 * 功能描述：编写一个程序，当键盘输入为“WSAD”这四个按键中的其中一个（大小写皆可），
 * 输出相对应的方向。比如用户输入“W”，输出“左”。
 */
package experiment4;

import java.util.Scanner;

public class Experiment4_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		System.out.println("请按下任意WASD键");
		while (start) {
			String press = scan.next().toLowerCase();
			switch (press) {
			case "w":
				System.out.println("上");
				break;
			case "a":
				System.out.println("左");
				break;
			case "s":
				System.out.println("下");
				break;
			case "d":
				System.out.println("右");
				break;
			case "n":
				start = false;
				break;
			default:
				System.out.println("输入错误！！");
			}

			if (start) {
				System.out.println("按WASD键继续，按下N键结束");
			}
			else{
				System.out.println("程序结束");
			}
		}
		scan.close();
	}
}
