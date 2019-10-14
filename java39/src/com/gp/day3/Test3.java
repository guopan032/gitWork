package com.gp.day3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 1.1从键盘输入一个整数，输出该数是奇数还是偶数。

//		System.out.print("请输入一个数字：");
//		int number = s.nextInt();
//		if (number%2==1) {
//			System.out.println(number + "是：奇数");
//		} else {
//			System.out.println(number +"是：偶数");
//		}

//		1.2如果你的java成绩大于90分，而且音乐成绩大于80分，就奖励你；
//		或者java成绩等于100分，音乐成绩大于70分，也可以奖励你

//		System.out.print("请输入您的java成绩：");
//		int java = s.nextInt();                  //从控制台获取java成绩
//		System.out.print("请输入您的音乐成绩：");
//		int music = s.nextInt();				 //从控制台获取音乐成绩
//		if(java>90 && music>80) {
//			System.out.println("你真是个好学生");
//		}else if(java==100 && music>70) {
//			System.out.println("不错，同样是个好学生");
//		}else {
//			System.out.println("你还差点意思");
//		}

//		1.3判定给定的年份是否为闰年
//		 提示：闰年的判定规则为：能被4整除但不能被100整除的年份，或能被400年整除的年份

//		System.out.print("请输入年份：");
//		int year = s.nextInt();
//		//System.out.println(year%4);
//		//System.out.println(year%100);
//		if((year%4==0 && year%100!=0) || year%400==0) {
//			
//			System.out.println(year+"是闰年");
//		}else {
//			System.out.println(year+"不是闰年");
//		}

		// 2.1输入赵明的考试成绩，显示所获奖励
		// 成绩==100分，爸爸给他买辆车
		// 成绩>=90分，妈妈给他买MP4
		// 90分>成绩>=60分，妈妈给他买本参考书
		// 成绩<60分，什么都不买

//		System.out.print("请输入赵明的成绩：");
//		int rs = s.nextInt();
//		if(rs<0) {
//			System.out.print("请出入正确的成绩!");
//		}else if(rs==100) {
//			System.out.print("爸爸奖励一辆车");
//		}else if(rs>=90) {
//			System.out.print("妈妈奖励MP4");
//		}else if(rs>=60 && rs<90) {
//			System.out.print("妈妈奖励参考书一本（不要也罢）");
//		}else {
//			System.out.print("奖励个屁");
//		}

		// 2.2编写一个简单的四则运算器，实现两个整数的四则运算
		// 提示：char类型的输入用：in.next().charAt(0)

//		System.out.print("请输入第一个数字：");
//		int num1 = s.nextInt();
//		System.out.print("请输入你需要的算数符号：");
//		char opt = s.next().charAt(0);
//		System.out.print("请输入第二个数字：");
//		int num2 = s.nextInt();
//		if(opt=='+') {
//			System.out.println(num1+"+"+num2+"="+(num1+num2));
//		}else if(opt=='-') {
//			System.out.println(num1+"-"+num2+"="+(num1-num2));
//		}else if(opt=='*') {
//			System.out.println(num1+"*"+num2+"="+num1*num2);
//		}else if(opt=='/') {
//			System.out.println(num1+"÷"+num2+"="+num1/num2);
//		}
//		

		// 2.3为你的手机设定了自动拨号，编写实现此业务

		System.out.print("请输入号码：");
		int num = s.nextInt();
		switch (num) {
		case 1:
			System.out.print("正在拨通爸爸的电话");
			break;
		case 2:
			System.out.println("正在拨通妈妈的电话");
			break;
		case 3:
			System.out.println("正在拨通爷爷的电话");
			break;
		case 4:
			System.out.println("正在拨通奶奶的电话");
			break;
		default:
			System.out.println("请输入正确的号码！");
		}

	}
}
