package experiment7;

import java.util.Scanner;

public class Calendar {

	public static void main(String args[]) {
		int day = 1;
		int day2 = 1;
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31 };
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个月份：");
		int month = scan.nextInt();
		scan.close();
		System.out.print("一\t二\t三\t四\t五\t六\t日\t");
		System.out.print("一\t二\t三\t四\t五\t六\t日\n");
		int daySum = 0;
		for (int i = 0; i <= month - 1; i++) {
			daySum += days[i];
		}
		int firstDay = 2 + daySum % 7;
		int firstDay2 = 2 + (daySum + days[month]) % 7;

		if (firstDay == 8) {
			firstDay = 1;
		}
		if (firstDay2 == 8) {
			firstDay2 = 1;
		}
		for (int i = 1; i <= 7; i++) {

			if (i >= firstDay) {
				System.out.print(day + "\t");
				day++;
			} else {
				System.out.print("\t");
			}
		}
		for (int i = 1; i <= 7; i++) {
			if (i >= firstDay2) {
				System.out.print(day2 + "\t");
				day2++;

			} else {
				System.out.print("\t");
			}
		}
		System.out.println();

		while (day <= days[month] || day2 <= days[month + 1]) {
			for (int i = 1; i <= 7; i++) {
				if (day <= days[month]) {
					System.out.print(day + "\t");
					day++;
				} else {
					System.out.print("\t");
				}
			}
			for (int i = 1; i <= 7; i++) {
				if (day2 <= days[month + 1]) {
					System.out.print(day2 + "\t");
					day2++;
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
