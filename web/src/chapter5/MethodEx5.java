package chapter5;

import java.util.Scanner;

public class MethodEx5 {
	
	int arrayIndex(int[] array, int inputArray) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == inputArray) {
				return i;
			}
		}
		return array.length;
	}
	
	int[] arrayReverse(int[] array) {
		int[] reverseArray = new int[10];
		int j = array.length - 1;
		for(int i = 0; i < array.length; i++, j--) {
			reverseArray[j] = array[i];
		}
		return reverseArray;
	}
	
	boolean arrayCMP(int[] ar, int[] ar2) {
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] != ar2[i]) {
				return false;
			}
		}
		return true;
	}
	// 2���� �迭�� ���� �� �ִ� �Ű������� ������.
	// �޼ҵ��� �̸��� arrayCMP
	// ��ȯ���� boolean
	// 2���� �迭�� �޾Ƽ� ���� �񱳸� �ϴ� �޼ҵ�
	// ������� �ΰ��� ������ true, �ٸ��� false
	// for���� ���ؼ� index 0 ~ �ش� �迭�� ������ �ݺ��ϸ鼭
	// ������ index�� ���� ���Ѵ�.

	public static void main(String[] args) {
		MethodEx5 m = new MethodEx5();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
		
		int[] arr3 = new int[10];

		System.out.print("���� 1 ~ 10�� �ϳ��� �Է��ϼ���: ");
		int input = Integer.parseInt(sc.nextLine());
		
		if(m.arrayIndex(arr, input) == arr.length) {
			System.out.println("�ش� ������ arr�迭�� ���� ���Դϴ�.");
		}else {
			System.out.println("�Է��� ���� �迭 Index�� " 
					+ m.arrayIndex(arr, input) + "�Դϴ�.");
		}
		
		arr3 = m.arrayReverse(arr);
		
		for(int i : arr3) {
			System.out.println(i);
		}
		
		System.out.println(m.arrayCMP(arr, arr3));
		

	}

}
