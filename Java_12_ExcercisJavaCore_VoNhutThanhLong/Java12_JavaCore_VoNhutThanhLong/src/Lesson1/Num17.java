package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Num17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
        int ranNum = rand.nextInt(1000)+1;
        String result= ranNum+"";
        String guest = "";
        
        //System.out.println("Số của chúng tôi là: " + result);
        
        while (!guest.equals(result)) {
        	System.out.println("--------------------------");
        	System.out.println("Nhập vào dự đoán của bạn ");
    		String num = sc.nextLine();
    		if (!num.matches("\\d+")) {
    			System.out.println("Nhập sai format");
    			return;
    		}
    		int n= Integer.parseInt(num);
    		if (n<ranNum) {
    			System.out.println("Số bạn vừa nhập nhỏ hơn số của chúng tôi");
    		} else if (n>ranNum){
    			System.out.println("Số bạn vừa nhập lớn hơn số của chúng tôi");
    		}
    		guest = n+"";
    		System.out.println(" ");
        }
        System.out.println("Bạn đoán đúng rồi");
	}
}
