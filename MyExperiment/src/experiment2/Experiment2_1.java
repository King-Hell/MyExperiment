package experiment2;
import java.util.Scanner;
public class Experiment2_1 {
	public static void main(String[] args){
		String regex ="\\d{3}";
		Scanner scan=new Scanner(System.in);
		System.out.println("��ӭʹ��ʮ������ת�˽���С����");
		System.out.print("������һ����λʮ��������");
		String x=scan.next();
		short n=new Short(x);
		scan.close();
		if(x.matches(regex)){
			String n2=Integer.toOctalString(n);
			System.out.println(n+"ת�����˽��ƺ�Ϊ:"+n2);
		}
		else{
			System.out.println("������λ����");
		}
	} 
}
