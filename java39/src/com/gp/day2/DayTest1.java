package com.gp.day2;

public class DayTest1 {

	/*
	 * 1.请说出java的基本数据类型有哪些，并说出分类 分为整数类型：byte，short，int,long. 浮点类型：float，double。
	 * 字符型：char 布尔型：boolean 2.String是基本数据类型吗 不是，String是引用数据类型 3.float型 float f =
	 * 3.4是否正确？ 错误，float是单精度浮点型，需要在后面加f或者F。正确：float f = 3.4f
	 * 4.float、int、char、short各占多少字节？ float>1位8字节，int>4位32字节，char>4位32字节，short>2位16字节
	 * 5.在main()中定义的变量不对其初始化就可以将值进行打印输出，对么？ 不对，main()中定义的变量是局部变量，必须进行初始化操作才能打印输出。
	 */

	/*
	 * 1 A.byte b = 256 错误，超出byte的范围 B.double d= 89L 正确，89L是long类型，可以自动转化为double类型
	 * C.char c= "a"; 错误，char类型用单引号。 D.short s = 8.6f;
	 * 错误，8.6f是float类型，相对short类型是大类型，只能强制转化 2 选择B 3 A.33.8属于浮点型，默认为double类型
	 * B.129属于整数类型，默认为int类型 C.89L属于long类型 D.8.6F属于float类型 4 A.float 1_variable =
	 * 3.4; 错误，变量名称不能以数字开头 B.int abc_ = 21; 正确 C.double a= 1+4e2.5； 错误，科学记数法错误
	 * D.short do = 15; 错误，do是关键字，不能作为变量名称 5 A.char c1='\"'  正确  \"表示的是双引号 B.char
	 * c3='x'; 正确 C.char c4="; 错误，char类型只能是一个字符，并且用单引号括起来 D.char c5=65;
	 * 正确，65是整数类型，可以通过unicode自动转换为char类型 6 A
	 * 
	 */
//	char c1 = '\"';
//	float aa=5;
//	char c='w';
//	int i=8;
//	long L=15;
//	float f= 8.9f;
//	 
//	i=c+i;
	public static void main(String[] args) {
		System.out.println(-3 >>> 1);
		System.out.println(-3 >> 1);
	}

}
