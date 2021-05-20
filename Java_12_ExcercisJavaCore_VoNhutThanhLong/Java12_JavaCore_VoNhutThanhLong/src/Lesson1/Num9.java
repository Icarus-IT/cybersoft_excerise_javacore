package Lesson1;

import java.util.Scanner;

public class Num9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 2 số a và b:");
		System.out.println("Nhập số nguyên dương thứ 1");
		String num1 = sc.nextLine();
		if (!num1.matches("\\d{2}")) {
			System.out.println("Nhập sai format");
			return;
		}
		System.out.println("Nhập số nguyên dương thứ 2");
		String num2 = sc.nextLine();
		if (!num2.matches("\\d{2}")) {
			System.out.println("Nhập sai format");
			return;
		}
		if (num2.contains(num1.substring(0,1))||num2.contains(num1.substring(1,2))) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}
