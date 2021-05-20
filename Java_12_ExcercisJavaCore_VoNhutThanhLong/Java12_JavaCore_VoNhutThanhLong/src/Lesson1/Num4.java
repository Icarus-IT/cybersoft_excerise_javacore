package Lesson1;

import java.util.Scanner;

public class Num4 {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int result=0;
		while (num>0) {
			result = result+ num %10;
			num=num/10;
		}
		System.out.println("Result is " + result);
	}
}
