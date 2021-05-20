package Lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Num20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng");
		String num = sc.nextLine();
		if (!num.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		int n= Integer.parseInt(num);
		int[] arr = new int[n];
		
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		for (int i=0;i<n;i++) {
			System.out.print("Nhập vào phần tử thứ "+(i+1)+" của mảng:");
			arr[i]=sc.nextInt();
			if (arr[i]%2==1) odd.add(arr[i]);
			else even.add(arr[i]);
		}
		System.out.print("Mảng vừa nhập là:");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.print("Mảng chẳn là: ");
		for (int i=0;i<even.size();i++) {
			System.out.print(even.get(i)+" ");
		}
		System.out.println("");
		System.out.print("Mảng lẻ là: ");
		for (int i=0;i<odd.size();i++) {
			System.out.print(odd.get(i)+" ");
		}
	}
}
