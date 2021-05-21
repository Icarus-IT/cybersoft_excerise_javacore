package Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Num13 {
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
		
		//----------------------------------
		float sum=0;
		int maxval = Integer.MIN_VALUE;
		int minval = Integer.MAX_VALUE;
		int maxpos=-1;
		int minpos=Integer.MAX_VALUE;
		int maxneg=Integer.MIN_VALUE;
		int minneg=0;
		//-----------------------------------
		for (int i=0;i<n;i++) {
			System.out.print("Nhập giá trị phần tử thứ "+ (i+1)+": ");
			arr[i]= Integer.parseInt(sc.nextLine());
			
			sum = sum +arr[i];
			if (arr[i]>maxval) {
				maxval=arr[i];
			}
			if (arr[i]<minval) {
				minval=arr[i];
			}
			if (arr[i]>maxpos&&arr[i]>0) {
				maxpos=arr[i];
			}
			if (arr[i]<minpos&&arr[i]>0) {
				minpos=arr[i];
			}
			if (arr[i]>maxneg&&arr[i]<0) {
				maxneg=arr[i];
			}
			if (arr[i]<minneg&&arr[i]<0) {
				minneg=arr[i];
			}
		}
		
		System.out.println("a/ Giá trị trung bình là "+sum/n);
		System.out.println("b/ Giá trị lớn nhất là "+ maxval+ ", Giá trị nhỏ nhất là "+ minval);
		if (maxpos==-1) {
			System.out.println("c/ Không có giá trị dương lớn nhất");
		} else
		System.out.println("c/ Giá trị dương lớn nhất là "+maxpos);
		
		if (minpos==Integer.MAX_VALUE) {
			System.out.println("Không có giá trị dương nhỏ nhất");
		} else
		System.out.println("Giá trị dương nhỏ nhất là "+minpos);
		
		if (maxneg==Integer.MIN_VALUE) {
			System.out.println("d/ Không có giá trị âm lớn nhất");
		} else
		System.out.println("d/ Giá trị âm lớn nhất là "+maxneg);
		
		if (minneg==0) {
			System.out.println("Không có giá trị âm nhỏ nhất");
		} else
		System.out.println("Giá trị âm nhỏ nhất là "+minneg);
		System.out.println("e/ Các phần tử chẵn:");
		for (int i=0;i<n;i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Các phần tử lẻ:");
		for (int i=0;i<n;i++) {
			if (arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("f/ Nhập giá trị muốn chèn vào:");
		String insert = sc.nextLine();
		if (!insert.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		int ins = Integer.parseInt(insert);
		
		System.out.println("Nhập vị trí muốn chèn vào:");
		String index = sc.nextLine();
		if (!index.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		int ind = Integer.parseInt(index);
		int[] newarr = new int[n+1];
		for (int i=0;i<ind-1;i++) {
			newarr[i]=arr[i];
		}
		newarr[ind-1]=ins;
		for (int i=ind-1;i<arr.length;i++) {
			newarr[i+1]=arr[i];
		}
		System.out.println("Mảng sau khi chèn vào là: "+Arrays.toString(newarr));
		
		
		System.out.println("g/ Nhập vị trí muốn xóa:");
		index = sc.nextLine();
		if (!index.matches("\\d+")) {
			System.out.println("Nhập sai format");
			return;
		}
		ind = Integer.parseInt(index);
	
		for (int i=ind;i<newarr.length;i++) {
			newarr[i-1]=newarr[i];
		}
		System.out.print("Mảng sau khi xóa là: ");
		for (int i=0;i<n;i++) {
			if (i==0) {
				System.out.print("["+newarr[i]+", ");
			} else
			if (i==n-1) {
				System.out.println(newarr[i]+"]");
			}
			else {
				System.out.print(newarr[i]+", ");
			}
		}
		
	}
}
