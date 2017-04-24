package experiment6;

import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class T03StringProc {
	public static void main(String[] args) throws Exception {
		final int N = 10000;
		Random random = new Random();
		// ������һ��ѭ���ֱ�ͳ��10���ļ�
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
		// ���ϲ���ʹ��ϵͳ��������kΪ��࣬NΪ��������,firstKΪ�����ȡ�ĵ�һ���е���
		double count = 0;
		double count2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 's') {
				count++;
			} else if (str2.charAt(i) == 'z') {
				count2++;
			}
		}
		System.out.println("�ļ�1��s�ı���Ϊ" + count / str2.length());
		System.out.println("�ļ�1��z�ı���Ϊ" + count2 / str2.length());
	}

}
// }
