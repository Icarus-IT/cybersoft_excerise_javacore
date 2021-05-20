package Lesson1;

import java.util.Scanner;

public class Num10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số nguyên dương");
		String num = sc.nextLine();
		if (!num.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		int n = Integer.parseInt(num);
		int result = 0;
		for (int i = 1;i<=n;i++) {
			if (checkPrime(i)) {
			result = result +i;
			}
		}
		System.out.println("Tổng từ 1 đến n là "+result);
	}
	public static boolean checkPrime(int n) {
		if (n < 2) return false;
		for (int i=2;i<=Math.sqrt(n);i++) {
			if (n % i==0) return false;
		}
		return true;
	}
}
