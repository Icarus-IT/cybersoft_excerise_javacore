package Lesson1;

import java.util.Scanner;

public class Num15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một chuỗi");
		String s = sc.nextLine();
		System.out.println("Độ dài của chuỗi là: "+ s.length());
		for (int i=0;i<s.length();i++) {
			System.out.println("Kí tự "+s.charAt(i)+" ở vị trí "+(i+1));
		}
		if (s.contains("abcdef")) {
			System.out.println("Chuỗi có chứa xâu abcdef");
		} else {
			System.out.println("Chuỗi không có chứa xâu abcdef");
		}
	}
}
