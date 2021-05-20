package Lesson1;

import java.util.HashMap;
import java.util.Scanner;

public class Num14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng");
		String num = sc.nextLine();
		if (!num.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		int n= Integer.parseInt(num);
	
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		for (int i=0;i<n;i++) {
			System.out.print("Nhập giá trị phần tử thứ "+ (i+1)+": ");
			list.put(Integer.parseInt(sc.nextLine()), 1);
		}
		System.out.println("Mảng đã xóa các phần tử đã lập là: ");
		for(int i:list.keySet()) {
			System.out.print(i+" ");
		}
		
	}
}
