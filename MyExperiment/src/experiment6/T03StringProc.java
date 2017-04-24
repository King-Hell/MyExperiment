package experiment6;

import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class T03StringProc {
	public static void main(String[] args) throws Exception {
		final int N = 10000;
		Random random = new Random();
		// 下面用一个循环分别统计10个文件
		// for(int n=1;n<=10;n++){
		String str = "";
		String str2 = "";
		Scanner scan = new Scanner(new File("data5.txt"));
		scan.useDelimiter("[\\s\\p{Punct}]");
		while (scan.hasNext()) {
			str += scan.next();
		}
		scan.close();
		int k = str.length() / N;
		int firstK = random.nextInt(k);
		for (int i = 0; i < N; i++) {
			str2 += str.charAt(firstK + i * k);
		}
		// 以上部分使用系统抽样法，k为组距，N为样本容量,firstK为随机抽取的第一组中的数
		double count = 0;
		double count2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 's') {
				count++;
			} else if (str2.charAt(i) == 'z') {
				count2++;
			}
		}
		System.out.println("文件1中s的比例为" + count / str2.length());
		System.out.println("文件1中z的比例为" + count2 / str2.length());
	}

}
// }
