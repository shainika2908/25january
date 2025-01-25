import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//write a program to check whether a character is UPPERCASE or LOWERCASE alphabet
		char ch;
		Scanner sc=new Scanner(System.in);
		char cod;
		do {
			System.out.println("please enter a char");
			ch=sc.next().charAt(0);
			if((ch>=('A'))&&(ch<='Z')) {
				System.out.println("ch is uppercase");
			}
			else if((ch>='a')&&(ch<='z')) {
				System.out.println("ch is a lowercase");
			}
			System.out.println("do you want to repeat?if yes pls enter 1 or 0");
			cod=sc.next().charAt(0);
		}while(cod=='n');
		 System.out.println("program ends");
	}

}
