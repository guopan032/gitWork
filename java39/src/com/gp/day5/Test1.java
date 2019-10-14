package com.gp.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1、1~10之间的整数相加，得到累加值大于20的当前数.
		/*
		 * 分析：1、使用循环进行累加，从1到10 2、判断累加值是否大于20 3、如果大于20，则跳出循环，并打印当前值
		 */

		/*
		 * int sum = 0; int i; for (i = 0; i <=10; i++) {
		 * 
		 * sum +=i; if(sum>20) { break; } }System.out.println(i);
		 */

		// 2、求出1000以内所有能被9整除的数之和，每行显示5个数

		/*
		 * int sum = 0; int cont = 0; for(int i=1;i<=1000;i++) { if(i%9==0) {
		 * System.out.print(i+","); cont ++; sum+=i; if(cont%5==0) {
		 * System.out.println(); } } } System.out.println("sum:"+sum);
		 */

		// 3、求1~10之间的所有偶数的平方和 (可以使用continue)
		/*
		 * int sum = 0; for(int i=1;i<=10;i++) { if(i%2!=0) { continue; } sum += i*i;
		 * }System.out.println(sum);
		 */

		// 4、求出10的N次方的值，N为用户输入的

		/*
		 * System.out.print("求10的N次方，请输入N："); int n = sc.nextInt(); int sum = 1; for(int
		 * i=0;i<n;i++) { sum*=10; } System.out.println("10的"+n+"次方是："+sum);
		 */

		// 5、打印九九乘法表

		/*
		 * for(int i=1;i<=9;i++) { for(int j=1;j<=i;j++) {
		 * System.out.print(j+"*"+i+"="+(i*j)+" "); }System.out.println(); }
		 */

		// 6、使用for循环打印出斐波那契数列,1，1，2，3，5，8，13，...
		// 要求：打印的数字的个数由用户从键盘输入
		// 提示：数列的规律：第一个数+第二个数=第三个数

		// 分析解释：斐波那契数列前两位是固定的1，那么就确定a，b的位置，通过c=a+b，确定第三位是c。然后将b赋给a，将c赋给b，
		// 将上一组的a b c位置换成a b null这个null用c代替，并且又通过c=a+b重新给c确定数字。依次类推，循环
		/*
		 * System.out.print("请输入斐波那契数列的个数："); int num = sc.nextInt(); int a=1; int b=1;
		 * int c=0; System.out.print(a+" "+b+" "); for (int i = 1; i <= num-2; i++) {
		 * c=a+b; a=b; b=c; System.out.print(c+" "); }
		 */

//		int a = 1;		
//		int b = 1;		
//		for(int i = 1;i <= 5;i++) {				
//			//循环打印a,b两个数，即两个两个打印			
//			System.out.print(a + "\t" + b + "\t");			
//			//打印第三、四个数			
//			a = a + b;			
//							
//			}

		/*
		 * 7、打印出这样的效果图：
		 * 
		 * * * * * * * * * * * * *
		 */

		/*
		 * for (int i = 1; i <=4 ; i++) { for (int j = 3; j >=i ; j--) {
		 * System.out.print(" "); } for (int k = 1; k <=i ; k++) {
		 * System.out.print("*"); } for(int m = 1;m<i;m++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

		// 8、用java的for循环计算1-1/2+1/3-1/4+1/5-1/6+1/7-1/8+1/9-1/10的值

		/*
		 * 解释：1-1/2+1/3-1/4+1/5-1/6+1/7-1/8+1/9-1/10可以加括号为：
		 * （1-1/2）+（1/3-1/4）+（1/5-1/6）+（1/7-1/8）+（1/9-1/10）
		 */

		/*
		 * double sum = 0; double num = 0; for (double i = 1; i <= 10; i+=2) {
		 * num=(1/i-1/(i+1));
		 * 
		 * sum +=num;
		 * 
		 * } System.out.println("sum:"+sum);
		 */

		// 9、统计个位数是2，百位数为4，能够被3整除的4位整数共有多少个，并输出

		/*
		 * int cont=0; for (int i = 1000; i <10000 ; i++) { if(i%10==2) { if
		 * (i/100%10==4) { if (i%3==0) { System.out.print(i+","); cont++; if(cont%5==0)
		 * { System.out.println(); }
		 * 
		 * } }
		 * 
		 * } }System.out.println("一共有:"+cont);
		 */

		// 10、用户输入一个数，判断这个数是否是素数

		/*
		 * System.out.print("请输入一个数字："); int num = sc.nextInt(); for(int i=2;i<=num;i++)
		 * { if(num%i==0) { int cont = i; if(cont==num) { System.out.println(num+"是素数");
		 * break; }else { System.out.println(num+"不是素数"); break; } }
		 * 
		 * }
		 */

		// 输出1~100之间的整数，个位是7的和能被7整除的数除外
//		System.out.println(5%7);
		for (int i = 1; i <= 100; i++) {
			if (i % 10 != 7 && i % 7 != 0 && (i / 10) % 10 != 7) {

				System.out.println(i);

			}
		}

	}
}
