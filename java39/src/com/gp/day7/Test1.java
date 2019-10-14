package com.gp.day7;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1、从控制台接受课程信息，不断累加直到输入“#”键结束，并输出全部课程信息
		/*
		 * StringBuffer sb = new StringBuffer(); String course; while(true) {
		 * System.out.println("请输入课程："); course = sc.next(); if(course.equals("#")) {
		 * break; } sb.append(course); } System.out.println(sb);
		 */

		/*
		 * 2、输入你的名字的拼音(格式：姓 名字)和性别，输出相应的问候语“你好，**先生/女士”。 如李小路则输入：Li
		 * xiaolu，女，控制台会输出“你好，Li女士”
		 */

		/*
		 * System.out.println("请输入您的姓名和性别(格式：Guo pan,男)："); String message =
		 * sc.nextLine(); String[] message1=message.split(" "); //通过空格分隔字符串 String
		 * surName = message1[0]; //将分割后的数组取第一位 int index = message.indexOf(",");
		 * //获取逗号的下标 String sex=message.substring(index+1, message.length()); //通过下标获取性别
		 * if(sex.equals("男")) { System.out.println("你好，"+surName+"帅哥"); }else {
		 * System.out.println("你好，"+surName+"女士"); } //System.out.println(sex);
		 */

		/*
		 * 3、回文字符串判断。所谓回文是指正读和反读都一样的数或文本段， 如abcba、1234321等。编写程序，从键盘输入字符串，由程序判断是否为回文串，
		 * 并给出提示。
		 */

		/*
		 * String shw = sc.next(); char[] chw = new char[shw.length()];
		 * //System.out.println(shw.charAt(1)); for (int i = 0; i < shw.length(); i++) {
		 * chw[i] = shw.charAt(i); } boolean flag =true; for(int i=0;i<chw.length/2;i++)
		 * { if(chw[i]==chw[chw.length-1-i]) { flag=true; }else { flag=false; break; } }
		 * if(flag) { System.out.println("该字符串是回文字符串"); }else {
		 * System.out.println("该字符串不是回文字符串"); }
		 */

		/*
		 * 4、实现用户注册功能，用户输入账号、密码和确认密码，注册用户！ 要求：a、用户的账号为邮箱形式，必须对邮箱进行验证 b、密码必须和确认密码一致
		 * c、密码长度必须是8~16位 d、用户的账号不能包含china，中国，共产党这些敏感字符 e、用户输入非法要给用户合理的提示
		 * (提示：该注册功能可以做成两种形式，一种是密码最多输入3次， 3次都输入不正确则不允许再注册，程序结束；
		 * 一种是可以无限的输入，只要不正确就重新输入，直到正确才能结束)
		 */

		/*
		 * 分析 账户：a、邮箱形式：必须包含"@"，包含"."，“.”的位置需要在@后面 d、用户不能包含敏感字符 e、用户输入非法字符，需要提示
		 * 密码：b、两次密码一致 c、密码长度必须是8~16位
		 * 
		 */

		// 输入用户
		while (true) {
			System.out.print("请输入您的用户名：");
			String userName = sc.next();
			if (userName.indexOf("@") == -1) {
				System.out.println("账户必须包含\"@\"");
				continue;
			}
			if (userName.indexOf(".") == -1) {
				System.out.println("账户必须包含\".\"");
				continue;
			}
			if (userName.indexOf(".") >= 0 && userName.indexOf("@") >= 0) {
				if (userName.indexOf("@") > userName.indexOf(".")) {
					System.out.println("账户中\".\"的必须在\"@\"后面");
					continue;
				}
			}

			if (userName.indexOf("china") >= 0) {
				System.out.println("账户必须不能包含\"china\"");
				continue;
			}
			if (userName.indexOf("中国") >= 0) {
				System.out.println("账户必须不能包含\"中国\"");
				continue;
			}
			if (userName.indexOf("共产党") >= 0) {
				System.out.println("账户必须不能包含\"共产党\"");
				continue;
			}
			break;
		}
		/*
		 * System.out.print("请输入您的用户名："); String userName = sc.next();
		 * if(userName.indexOf("@")==-1) { System.out.println("账户必须包含\"@\""); }
		 * if(userName.indexOf(".")==-1) { System.out.println("账户必须包含\".\""); }
		 * if(userName.indexOf(".")>=0 && userName.indexOf("@")>=0) {
		 * if(userName.indexOf("@")>userName.indexOf(".")) {
		 * System.out.println("账户中\".\"的必须在\"@\"后面"); } }
		 * 
		 * if(userName.indexOf("china")>=0) { System.out.println("账户必须不能包含\"china\""); }
		 * if(userName.indexOf("中国")>=0) { System.out.println("账户必须不能包含\"中国\""); }
		 * if(userName.indexOf("共产党")>=0) { System.out.println("账户必须不能包含\"共产党\""); }
		 */

		// 密码验证
		int index = 0;
		int index1 = 0;
		String passWord;
		String passWord1;
		for (int i = 0; true; i++) {
			// 输入密码
			System.out.print("请输入您的密码：");
			passWord = sc.next();
			if (passWord.length() < 8 || passWord.length() > 16) {
				System.out.println("密码的长度必须是8-16位");
				index++;
				continue;
			}

			System.out.print("请再确认密码：");
			passWord1 = sc.next();
			if (!(passWord.equals(passWord1))) {
				System.out.println("两次输入密码不相同");
				index1++;
				System.out.println(index1);

			} else {
				break;
			}
			if (index1 == 3) {
				break;
			}
		}
		if (index1 == 3) {
			System.out.println("密码确认超过三次，注册失败");
		} else {
			System.out.println("恭喜您，注册成功！");
		}

	}
}
