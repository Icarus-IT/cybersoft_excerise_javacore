package Lesson1;

import java.util.Scanner;

public class Num2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Convert 10 to 2");
		System.out.println("2. Convert 2 to 10");
		System.out.println("3. Exit");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			
			System.out.println("Input number in 10 base");
			int num = sc.nextInt();
			String x="";
			while (num>0) {
				x=num%2+x+"";
				num=num/2;
			}
			System.out.println(x);
			break;

		case 2:
			System.out.println("Input number in 2 base");
			int num2 = sc.nextInt();
			int p = 0;
		    int result = 0;
		    while (num2 > 0)
		    {
		        result += (num2 % 10) * Math.pow(2, p);
		        ++p;
		        num2 /= 10;
		    }
		    System.out.println(result);
		default:
			break;
		}
		
	}
}
