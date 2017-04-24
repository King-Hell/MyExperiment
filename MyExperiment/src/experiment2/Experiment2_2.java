package experiment2;
import java.util.Scanner;
public class Experiment2_2 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("欢迎使用一元二次方程求根程序");
		System.out.println("请输入方程的系数");
		System.out.print("a=");
		int a=scan.nextInt();
		System.out.print("b=");
		int b=scan.nextInt();
		System.out.print("c=");
		int c=scan.nextInt();
		scan.close();
		double delta=b*b-4*a*c;
		if(delta<0){
			System.out.println("此方程无解");
		}
		else if(delta==0){
			double x=-b/(2*a);
			System.out.println("方程的根为：X1=X2="+x);
		}
		else if(delta>0){
			double x1=(-b-Math.sqrt(delta))/(2*a);
			double x2=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("方程的两根为：X1="+x1+"\tX2="+x2);
		}
		
	}
}
