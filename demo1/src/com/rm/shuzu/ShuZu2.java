package com.rm.shuzu;

import java.util.*;

public class ShuZu2 {
	public static void main(String[] args) {
		int count;
		double next, sum, average;
		sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入七天的温度：");
		for (count = 0; count < 7; count++) {
			next = sc.nextDouble();
			sum += next;
		}
		System.out.println(sum);
		average = sum / 7;
		System.out.println("平均气温为：" + average);

	}

}
