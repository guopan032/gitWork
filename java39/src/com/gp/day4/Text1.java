package com.gp.day4;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 1.求数100以内所有偶数的和

//		int sum = 0;
//		int num = 0;
//		while(num <= 100) {
//			if(num%2==0) {  //num%!=0,则求的是100以内所有奇数的和。
//				sum += num;
//			}
//			num++;
//		}
//		System.out.println(sum);

		// 2.输入一个整数（1~9），求该数的阶乘并输出

//		System.out.print("请输入一个1~9的数字：");
//		int a = s.nextInt();
//		int i = 1;
//		int sum =1;
//		if (1<=a && a<=9) {
//			while(i<=a) {
//				sum =sum*i;
//				i++;
//			}System.out.println(a+"的阶乘是："+sum);
//		}else {
//			System.out.println("请按规定输入的数字");
//		}

		// 4.输出100以内能被7整除的前5个数。

//		int i=1;
//		while(i<100) {
//			if(i%7==0) {
//				System.out.println(i+"，");
//			}
//			if(i/7==5) {
//				break;
//			}
//			i++;
//		}

		// 输出15~100以内能被7整除的前5个数

//		int i=15;
//		int conts=0;
//		while(i<100) {
//			if(i%7==0) {
//				System.out.println("i:"+i);
//				conts++;
//			}
//			if(conts==5) {
//				break;
//			}
//			i++;
//		}

		// 5.缸子里能装50升水。现有15升，每次能挑5升。要挑几次才能挑满。

//		int a = 15;
//		int now= a;
//		int i =1;
//		while(now<50) {
//			now=a+5*i;
//			if(now>45) {    //当执行到大于45时，再挑5升就会溢出，所以要跳出循环，不再执行下面的i++
//				break;
//			}
//			i++;
//		}System.out.println(i);
//		

		// 6.用户循环输入4位会员号，判断是否位幸运会员（会员的百位数等于指定数即为幸运会员）
		// 输入0结束循环，使用do-while循环

//		int member;
//		do {
//			System.out.print("请输入4位会员号：");
//			member = s.nextInt();			  //循环获取用户会员号
//			if((member/100)%10==8) {			//指定百位数为8时，此用户为幸运会员
//				System.out.println("恭喜您成为幸运会员！");					
//			}else {
//				if (member==0) {
//					break;
//				}
//				System.out.println("很遗憾，您没能成为幸运会员！");					
//			}
//		}while (member!=0);
//		System.out.println("抽奖结束");

		// 7.求出1000以内所有能被4和5整除并且不能被3整除的数之和。

//		int i = 1;
//		int sum = 0;
//		while(i<=1000) {
//			if(i%4==0 && i%5==0 && i%3!=0) {
//				sum += i;
//			}
//			i++;
//		}System.out.println(sum);

		// 3.使用do-while实现：输出设施温度与华氏温度的对照表，要求他从摄氏温度0~250，每隔20为一项
		// 对照表的条目不超过10条。
		// 转换关系：华氏温度 = 摄氏温度*9/5.0+32.0
		// 提示：1、循环操作：计算摄氏温度，并输出对照条目
		// 2、循环条件<=10&& 摄氏温度<=250

//		double c = 0;
//		double f = 0;
//		int cont = 1;
//		do {
//			
//			f=c*9/5.0+32;
//			System.out.println("cont:"+cont);
//			System.out.println("摄氏："+c+",华氏："+f);
//			c+=20;
////			if(cont==10) {
////				break;
////			}
//			cont++;
//		}while(c<250 && cont<=10);
//		

		// 8.猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个
		// 第二天早上又将剩下的桃子吃掉一半，又多吃了一个，以后每天早上都吃了前一天剩
		// 下的一半零一个，第十天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少？

//		int i=10;  //天数
////		int sum = 0;  //总数
//		int num = 1;   //第十天的数量
//		while(i>=1) {
//			System.out.println("第"+i+"天的桃子数是："+num);
//			if(i==1) {
//				break;
//			}
////			sum +=num;
//			num = (num+1)*2;
//			i--;
//		}System.out.println("num:"+num);

//		int i = 10;  
//		int num = 1;
//		do {
//			System.out.println("第"+i+"天的桃子数是："+num);
//			num = (num+1)*2;
//			i--;
//		}while(i<=10 && i>0);

		// 9.要求用户输入一个整数，将它各个数位的数字反转并输出，如输入123，则输出321！
//		System.out.println("请输入一个整数：");
//		int num = s.nextInt();
//		int a =0;
//		while(num!=0) {
//			 a = num%10;    //获取个位数
//			
//			num = num/10;
//			System.out.print(""+a);
//		}
//		

		// 10.有一个猜数字游戏，系统随机生成一个数（0--99）让用户来猜，直到猜中为止。
		// 每次猜完后给出提示，以便下次猜测更接近正确数字，猜对则退出，不再继续猜。
		// 统计用户猜测的次数，并给出不同的评价：次数<=3，为“一级，天才”，
		// 次数在4-6之间为“二级，人才”,次数在7-9之间为“三级，一般般”，
		// 多于9次的为“四级，回家练练再来吧”。

		System.out.println("请输入目标数：");
		int num = s.nextInt();
		int a = 0;
		do {
			System.out.println("请输入你猜的数：");
			a = s.nextInt();
			if (a > num) {
				System.out.println("大了");
			} else if (a == num) {
				System.out.println("正确");
			} else if (a < num) {
				System.out.println("小了");
			}

		} while (a != num);

	}
}
