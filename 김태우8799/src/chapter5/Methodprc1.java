package chapter5;

public class Methodprc1 {
	// 2개의 배열을 받을 수 있는 매개변수를 가진다.
	// 메소드의 이름은 arrayCMP
	// 반환형은 boolean
	// 2개의 배열을 받아서 서로 비교를 하는 메소드
	// 결과값은 두개가 같으면 true, 다르면 false
	// for문을 통해서 index 0 ~ 해당 배열의 끝까지 반복하면서
	// 동일한 index의 값을 비교한다.
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
