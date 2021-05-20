package Lesson1;

import java.util.Scanner;

public class Num11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số tự nhiên");
		String num = sc.nextLine();
		if (!num.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		double result = Math.log10(Integer.parseInt(num))/Math.log10(2);
		if (result%1==0)System.out.println("Số lớn nhất nhỏ hơn log2(n) là "+ ((int)result-1)); 
		else
		System.out.println("Số lớn nhất nhỏ hơn log2(n) là "+ (int)result);
	}
}
