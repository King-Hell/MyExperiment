package experiment2;
import java.util.Scanner;
public class Experiment2_1 {
	public static void main(String[] args){
		String regex ="\\d{3}";
		Scanner scan=new Scanner(System.in);
		System.out.println("欢迎使用十进制数转八进制小程序");
		System.out.print("请输入一个三位十进制数：");
		String x=scan.next();
		short n=new Short(x);
		scan.close();
		if(x.matches(regex)){
			String n2=Integer.toOctalString(n);
			System.out.println(n+"转换到八进制后为:"+n2);
		}
		else{
			System.out.println("不是三位数字");
		}
	} 
}
