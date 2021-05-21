package Lesson1;

import java.util.Scanner;

public class Num7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số: ");
		String s = sc.nextLine();
		int n = 0;
		
		if (checkInt(s)) {
			n = Integer.parseInt(s);
			
			System.out.println("Các ước của số vừa nhập là");
			if (n==0) System.out.println("1");
			for (int i = 1; i<=n;i++) {
				if (n%i==0) {
					if (i==n) {
						System.out.print(i);
					} else {
						System.out.print(i + ", ");
					}
				}
			}
		} else {
			System.out.println("Nhập sai format");
		}
		
		
		
		
	}
	public static boolean checkInt(String n) {
		if (n.matches("\\d++")) return true;
		return false;
	}
}
