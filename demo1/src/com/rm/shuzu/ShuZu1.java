package com.rm.shuzu;

import java.util.Scanner;

public class ShuZu1 {
	public static void main(String[] args) {
		int count;
		double sum, average;
		sum = 0;
		double[] temperature = new double[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入七天的温度：");
		for (count = 0; count < temperature.length; count++) {
			temperature[count] = sc.nextDouble();
			sum += temperature[count];
		}
		average = sum / 7;
		System.out.println("平均气温为：" + average);
		for (count = 0; count < temperature.length; count++) {
			if (temperature[count] < average)
				System.out.println("第" + (count + 1) + "天气温度低于平均气温");
			else if (temperature[count] > average)
				System.out.println("第" + (count + 1) + "天气温度高于平均气温");
			else
				System.out.println("第" + (count + 1) + "天气温度等于平均气温");

		}
	}

}
