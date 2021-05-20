package Lesson1;

import java.util.Scanner;

public class Num5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter coordinate of A(x1,y1)");
		System.out.println("x1= ");
		int x1 = sc.nextInt();
		System.out.println("y1= ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter coordinate of B(x2,y2)");
		System.out.println("x2= ");
		int x2 = sc.nextInt();
		System.out.println("y2= ");
		int y2 = sc.nextInt();
		System.out.println("Length of AB is "+Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
	}
}
