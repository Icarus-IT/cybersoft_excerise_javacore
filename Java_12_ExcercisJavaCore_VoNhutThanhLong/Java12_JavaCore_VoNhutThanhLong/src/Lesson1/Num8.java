package Lesson1;

import java.util.Scanner;

public class Num8 {
	public static void main(String[] args) {
		System.out.print("Nhập chuỗi: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] list = s.split(" ");
		for (int i=0;i<list.length;i++) {
			System.out.print((list[i].substring(0,1)).toUpperCase());
			System.out.print((list[i].substring(1,list[i].length()))+" ");
		}
	}
}
