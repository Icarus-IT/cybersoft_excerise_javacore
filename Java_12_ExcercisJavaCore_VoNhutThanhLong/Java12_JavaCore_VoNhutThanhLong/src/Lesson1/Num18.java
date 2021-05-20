package Lesson1;

import java.util.Scanner;

public class Num18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số tiền: ");
		
		Float money= sc.nextFloat();
		
		System.out.println("Nhập vào số tiền muốn có trong tương lai: ");
		
		Float future= sc.nextFloat();
		
		System.out.println("Nhập vào lãi hàng năm: ");
		Float lai= sc.nextFloat();
		int count=0;
		while (money<future) {
			count++;
			money=money*(1+lai);
		}
		System.out.println("Phải đợi "+ count+" năm");
	}
}
