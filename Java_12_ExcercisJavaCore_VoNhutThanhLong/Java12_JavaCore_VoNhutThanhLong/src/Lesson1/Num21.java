package Lesson1;

import java.util.Scanner;

public class Num21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x0 of kangoru 1");
		int x01 = sc.nextInt();
		System.out.println("Enter v of kangoru 1");
		int v1 = sc.nextInt();
		System.out.println("Enter x0 of kangoru 2");
		int x02 = sc.nextInt();
		System.out.println("Enter v of kangoru 2");
		int v2 = sc.nextInt();
		double result = (double)(x02-x01)/(v1-v2);
		if (result %1==0&&result>0) {
			System.out.println("Gặp được");
			System.out.println(result);
		}
		else {
			System.out.println("Không gặp được");
		}
	}
}
