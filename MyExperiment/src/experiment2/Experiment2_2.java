package experiment2;
import java.util.Scanner;
public class Experiment2_2 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("��ӭʹ��һԪ���η����������");
		System.out.println("�����뷽�̵�ϵ��");
		System.out.print("a=");
		int a=scan.nextInt();
		System.out.print("b=");
		int b=scan.nextInt();
		System.out.print("c=");
		int c=scan.nextInt();
		scan.close();
		double delta=b*b-4*a*c;
		if(delta<0){
			System.out.println("�˷����޽�");
		}
		else if(delta==0){
			double x=-b/(2*a);
			System.out.println("���̵ĸ�Ϊ��X1=X2="+x);
		}
		else if(delta>0){
			double x1=(-b-Math.sqrt(delta))/(2*a);
			double x2=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("���̵�����Ϊ��X1="+x1+"\tX2="+x2);
		}
		
	}
}
