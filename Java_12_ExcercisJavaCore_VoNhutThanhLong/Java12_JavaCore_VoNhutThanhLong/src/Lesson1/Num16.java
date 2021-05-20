package Lesson1;

import java.util.Scanner;

public class Num16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào năm");
		String num = sc.nextLine();
		if (!num.matches("\\d{4}")) {
			System.out.println("Nhập sai format");
			return;
		}
		int year = Integer.parseInt(num);
		if (checkyear(year)) {
			System.out.println("Năm nhuận");
		} else {
			System.out.println("Năm không nhuận");
		}
	
	}
	public static boolean checkyear(int year) {
		if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            } else {
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
	}
}
