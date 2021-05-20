package Lesson1;

import java.util.Scanner;

public class Num22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập xâu");
		String s = sc.nextLine();
		int save=0;
		int result=0;
		int max = 0;
		for (int i=0;i<s.length()-1;i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				save = i;
				int count=0;
				
				while (s.charAt(save-count)==s.charAt(save+1+count)) {
					count++;
					if (count>i||i+count+1>=s.length()) break;
					
				}
				if (count>max) {
					max=count;
					result=save;
				}
				
			}
			
		}
		System.out.print("Xâu dài nhất đối xứng là: ");
		for (int i=result+1;i<result+max+1;i++) {
			System.out.print(s.charAt(i));
		}
	}
}
