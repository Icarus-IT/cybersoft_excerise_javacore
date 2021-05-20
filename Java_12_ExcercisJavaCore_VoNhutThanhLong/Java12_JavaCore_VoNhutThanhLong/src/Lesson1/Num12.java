package Lesson1;

import java.util.Scanner;

public class Num12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số tự nhiên từ 1 - 9");
		String num = sc.nextLine();
		if (!num.matches("[1-9]")) {
			System.out.println("Nhập sai format");
			return;
		}
		String result = "";
		int n = Integer.parseInt(num);
		for (int i=1;i<=n;i++) {
			result = result+i+"";
			System.out.println(result);
		}
	}
}
