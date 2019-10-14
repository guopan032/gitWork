package com.gp.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	/*
	 * 1.什么是数组 数组是一个变量，储存相同数据类型的一组数据， 通过下标获取数组中的每一个数据，下标从0开始 2.如何创建及初始化数组
	 * 一、创建的时候直接初始化：int[] a={1,12,3,4,5,5}; 二、先创建，再赋值：int[] a=new int[5]; a[1]= 1;
	 * a[2]= 2; 三、创建并赋值：int[] a=new int[]{1,2.3313,12} 3、如何获取数组的长度 a.length
	 * 4、如何得到数组中的第2个元素值？(下标从0开始) a[1] 5、如何将数组中的元素都遍历 利用循环遍历，whlie、do while、for都可以
	 * 还可以利用for each进行遍历：for(int num:a){System.out.print(num)} 6、如何复制数组
	 * 数组的存储方式是：定义的变量存放在栈内存中，初始化的数据存放在堆内存中， 变量对应的是堆内存所储存数据的地址； int[]
	 * a={1,2,3,4,5,5,8}; int[] b=a; 这样复制，只是将a的地址给了b，数据在堆内存中只有一个，a和b都有存放数据的地址，都可以访问
	 * 7、Java.util.Arrays类为我们完成了哪些功能 排序：sort。查询：
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* 习题 */
		// 1、小明要去买一部手机，他询问了4家店的价格，
		// 分别是2800元，2900元，2750元和3100元，
		// 显示输出最低价（要求使用数组）

		/*
		 * int[] price = {2800,2900,2750,3100}; int min=price[0]; for (int i = 1; i <
		 * price.length; i++) { if(price[i]<min) { min = price[i]; }
		 * }System.out.println(min);
		 */

		// 2、某班有6名学生
		// 一、输入该班每个学生的成绩
		// 二、计算并输出该班的总分和平均数
		// 三、输出该班学生的最高分和最低分及其相应的下标
		// 四、输入一个成绩，查看该班有没有该成绩，有则输出其下标，没有则输出无该分数
		// 五、对该班学生成绩进行降序排序
		// 六、思考:若该班又增加了一名新学生，需要将其成绩添加到数组中，
		// 并且要保持增加后的数组依然降序排列
		// （提示：为保证能增加一个新数据，数组长度要定义为7）

		int[] score = new int[6];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println("这6名学生的成绩之和是：" + sum);
		avg = (double) sum / score.length;
		System.out.println("这6名学生的平均成绩是" + avg);
		// 求最高分、最低分并求下标
		/*
		 * int max=score[0]; int min = score[0]; int cont1 = 0; int cont = 0; for (int i
		 * = 0; i < score.length; i++) { if(score[i]>max) { max = score[i]; cont =i; }
		 * if(score[i]<min) { min = score[i]; cont1=i; } }
		 * System.out.println("最高分是："+max+",该成绩对应的下标是"+cont);
		 * System.out.println("最低分是："+min+",该成绩对应的下标是"+cont1);
		 */

		// 输入成绩，判断有没有该成绩，并拿下标
		System.out.print("请输入一个成绩：");
		int index = 0;
		int score1 = sc.nextInt();
		boolean flag = true;
		for (int i = 0; i < score.length; i++) {
			if (score1 == score[i]) {
				index = i;
				flag = true;

			}
		}

		if (flag) {
			System.out.println("存在该成绩，其角标为：" + index);
		} else {
			System.out.println("没有！");
		}

		// 对该班成绩降序排列
		/*
		 * int temp=0; for (int i = 0; i < score.length; i++) { for (int j = 0; j <
		 * score.length-1; j++) { if(score[j]<score[j+1]) { temp = score[j]; score[j] =
		 * score[j+1]; score[j+1] = temp; } } } System.out.print("降序成绩是："); for(int
		 * a:score) { System.out.print(a+" "); }
		 */

//		int[] insert =new int[6];S
//		insert = score;
//		
//		System.out.println("***"+insert[6]);

		// 增加一个新学生

		/*
		 * int[] a = {10,8,6,5,3,1}; int[] b = new int[7]; for (int i = 0; i < a.length;
		 * i++) { b[i]=a[i]; } System.out.println("请输入新学员成绩："); int num = sc.nextInt();
		 * int i; int index =0; for (i = 0; i < b.length-1; i++) { if(num>=b[i]) { index
		 * = i; break; } } // System.out.println(i); for (int j = b.length-1; j >i ;
		 * j--) { b[j] = b[j-1];
		 * 
		 * } b[i]=num;
		 * 
		 * for(int s:b) { System.out.print(s+" "); }
		 */

		// 3、校园歌手大赛，有10评委，请设计一个程序，输入10位评委的打分，
		// 然后去掉一个最高分和一个最低分，余下8位评委的平均分将会是该选手的得分，
		// 输出该选手的得分。

		/*
		 * int[] a = {3,6,2,4,1,5,10,9,7,8};
		 * 
		 * //求出最高分和最低分 int max=a[0]; int min=a[0]; int sum=0; double avg = 0; for (int i
		 * = 0; i < a.length; i++) { if(a[i]>max) { max=a[i]; } if(a[i]<min) { min =
		 * a[i]; } sum+=a[i]; //System.out.println(max+"+"+min);
		 * }System.out.println("最高分是："+max+"，最低分是："+min);
		 * avg=(double)(sum-max-min)/(a.length-2); System.out.println("该选手的最终得分是："+avg);
		 */

		// 4、(1)要求从键盘输入10个整数，然后对这10个数进行降序排序并输出。
		// (2)将数组反序

		// (1)
		// 键盘输入
		/*
		 * int[] a = new int[10]; for (int i = 0; i < a.length; i++) {
		 * System.out.println("请输入第"+(i+1)+"个数："); int num =sc.nextInt(); a[i] = num; }
		 * //降序 int temp=0; for (int i = 0; i < a.length; i++) { for (int j = 0; j <
		 * a.length-1; j++) { if(a[j]<a[j+1]) { temp = a[j]; a[j] = a[j+1]; a[j+1] =
		 * temp; } } } for(int s:a) { System.out.println(s); }
		 */

		// (2)将数组反序

		/*
		 * int[] a= {7,9,5,8,3,4,1}; int temp= 0; for (int i = 0; i < a.length/2; i++) {
		 * temp =a[i]; a[i] = a[a.length-1-i]; a[a.length-1-i] = temp; }
		 * 
		 * for(int s:a) { System.out.print(s+" "); }
		 */

		/*
		 * int[] arr = new int[] {8,2,1,0,3}; int[] index = new int[]
		 * {2,0,3,2,4,0,1,3,2,3,3}; String tel=""; for(int i:index) { tel+=arr[i]; }
		 * System.out.println("联系方式："+tel);
		 */

	}

}
