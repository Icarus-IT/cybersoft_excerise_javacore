package Lesson1;

import java.util.Scanner;

public class Num19 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int choose = -1;
		while (choose!=3) {
			menu();
			String choice ="";
			boolean flag=true;
			do {
			flag = true;
			choice = sc.nextLine();
			if (!choice.matches("[1-3]")) {
				flag=false;
				System.out.println("Nhập sai format, nhập lại");
			}
			}while (flag==false);
			choose= Integer.parseInt(choice);
			switch (choose) {
			case 1:
				System.out.println("Nhập a và b của phương trình ax+b =0");
				System.out.print("Nhập a:");
				float a = Float.parseFloat(sc.nextLine());
				System.out.print("Nhập b:");
				float b = Float.parseFloat(sc.nextLine());
				System.out.println("x= "+(-b/a));
				break;
			case 2:
				System.out.println("Nhập a, b, c của phương trình ax^2+bx+c=0");
				System.out.print("Nhập a:");
				float a1 = Float.parseFloat(sc.nextLine());
				System.out.print("Nhập b:");
				float b1 = Float.parseFloat(sc.nextLine());
				System.out.print("Nhập c:");
				float c1 = Float.parseFloat(sc.nextLine());
				if (b1*b1-4*a1*c1<0) System.out.println("Phương trình vô nghiệm");
				else if (b1*b1-4*a1*c1==0) {
					System.out.println("Phương trình có một nghiệm duy nhất là:" +((-b1)/(2*a1)));
				} else {
					System.out.println("Nghiệm thứ 1 là:" +((-b1+Math.sqrt(b1*b1-4*a1*c1))/(2*a1)));
					System.out.println("Nghiệm thứ 2 là:" +((-b1-Math.sqrt(b1*b1-4*a1*c1))/(2*a1)));
				}
				break;
			case 3:
				System.out.println("Exited");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("--------Menu--------");
		System.out.println("1. Phương trình bậc 1");
		System.out.println("2. Phương trình bậc 2");
		System.out.println("3. Exit");
		System.out.println("Nhập sự lựa chọn của bạn");
	}
}
