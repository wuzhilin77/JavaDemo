package com.rm.shuzu;

public class ShuZu5 {
	public static void main(String[] args) {
		int[] intArray = { 12, 11, 45, 6, 8, 43, 40, 57, 3, 20 };
		System.out.println("排序前的數組：");
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + "	");
		System.out.println();
		int temp;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i; j < intArray.length; j++) {
				if (intArray[j] < intArray[i]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		System.out.println("排序后的數組：");
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + "	");
	}

}
