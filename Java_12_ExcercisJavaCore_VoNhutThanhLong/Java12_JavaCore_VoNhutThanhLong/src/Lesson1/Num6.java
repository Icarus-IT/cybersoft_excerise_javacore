package Lesson1;

import java.util.Scanner;

public class Num6 {
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
