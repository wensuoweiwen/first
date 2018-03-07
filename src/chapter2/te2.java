package chapter2;

import java.util.Scanner;

public class te2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数:");
		int x=sc.nextInt();
		int y=hanshu(x);
		System.out.println("y="+y);
		
	}
	public static int hanshu(int x) {
		int y=0;
		int t=x>0?1:x<0?3:2;
		switch(t) {
		case 1 : y=x+3;
		break;
		case 2 : y=0;
		break;
		case 3 : y=x*x-1;
		break;
		}
		return y;
	}

}
