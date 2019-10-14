package com.gp.day3;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入您的名字：");
		String name = in.next();
		System.out.print("年龄：");
		int age = in.nextInt();
		System.out.print("体重：");
		double weight = in.nextDouble();
		System.out.print("婚否：");
		boolean marriage = in.nextBoolean();
		System.out.println("姓名：" + name + "\n年龄：" + age + "\n体重：" + weight + "\n婚否：" + marriage);

	}

}
