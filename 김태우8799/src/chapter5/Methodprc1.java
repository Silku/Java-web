package chapter5;

public class Methodprc1 {
	// 2���� �迭�� ���� �� �ִ� �Ű������� ������.
	// �޼ҵ��� �̸��� arrayCMP
	// ��ȯ���� boolean
	// 2���� �迭�� �޾Ƽ� ���� �񱳸� �ϴ� �޼ҵ�
	// ������� �ΰ��� ������ true, �ٸ��� false
	// for���� ���ؼ� index 0 ~ �ش� �迭�� ������ �ݺ��ϸ鼭
	// ������ index�� ���� ���Ѵ�.
	boolean arrayCMP(int[] array, int [] array2) {
		int boolean = 
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if (array[i] == array2[j]){
					boolean = true;
			}else (array[i] != array2[j]){
				 boolean = false;
			}
		}	
	}
	return ; 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
