package com.gp.day3;

public class Test {

	public static void main(String[] args) {

		// 根据天数（46）计算周数和剩余天数
		int day = 46;
		System.out.println("46天的周数是：" + day / 7 + ";剩余天数是：" + 46 % 7);

		// 根据圆的半径radius = 1.5，求其面积（圆的面积公式：s=3.14*r*r）
		double m = 3.14;
		double radius = 1.5;
		double s = m * radius * radius;
		System.out.println("圆的面积是：" + s);

		// 实现一个数字加密器，加密规则是：加密结果 = （整数*10+5）/2+3.14159
		int a = 2;
		double secret = (a * 10 + 5) / 2 + 3.14159;
		System.out.println("加密结果是：" + secret);

		// 两个水桶A和B里分别装入2升水与4升水，请将两个水桶中的水进行互换
		int A = 2;
		int B = 4;
		int temp;
		temp = A;
		A = B;
		B = temp;
		System.out.println("A中现在的水：" + A + "；B中现在的水：" + B);

	}
}
