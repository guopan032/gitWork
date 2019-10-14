package com.gp.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int[] a = { 1, 22, 44, 11, 21, 551 };

		// foreach遍历

		/*
		 * for(int b:a) { System.out.println(b); }
		 */

		// for循环遍历，并求和

		/*
		 * int sum = 0; for (int i = 0; i < a.length; i++) { System.out.println(a[i]);
		 * sum +=a[i]; }System.out.println(sum);
		 */

		// while循环遍历,并求和

		/*
		 * int i=0; int sum = 0; while(i<a.length) { System.out.println(a[i]); sum
		 * +=a[i]; i++; }System.out.println(sum);
		 */

		// do while循环遍历,并求和

		/*
		 * int i=0; int sum=0; do { System.out.println(a[i]); sum=sum+a[i]; i++;
		 * }while(i<a.length); System.out.println(sum);
		 */

		// 练习

		/*
		 * String b= new String("ss"); String c=b;
		 * 
		 * System.out.println(b==c);
		 */

		Scanner sc = new Scanner(System.in);
		int[] so = new int[5];

	}
}
