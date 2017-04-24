package experiment5;

import java.io.File;
import java.util.Scanner;

public class T02Scanner {
	public static void main(String args[]) throws Exception {
		String filename = "data3.txt";
		//double op1, op2=0;
		int size;
		String operator = "";
		Scanner scanner = new Scanner(new File(filename));

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			String[] strArray = str.split(" ");
			size = (strArray.length - 1) / 2;
			
			for (int i = 1; i <= size; i++) {

				operator=strArray[i*2-1];
				if(operator.equals("*")){
					//op1=Integer.parseInt(strArray[i*2-2]);
					//op2=Integer.parseInt(strArray[i*2]);
					
				}
				/*if (operator.equals("+"))
					op1 = op1 + op2;
				else if (operator.equals("-"))
					op1 = op1 - op2;
				else if (operator.equals("*"))
					op1 = op1 * op2;
				else if (operator.equals("/")) {
					op1 = op1 / op2;
				*/}
			}
			//System.out.println("result is " + op1);
			scanner.close();
			
		}
		
	}

