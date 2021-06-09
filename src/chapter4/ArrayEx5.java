package chapter4;

// 2차원 배열
// 3차원 이상의 배열을 다차원 배열이라고 한다.
public class ArrayEx5 {

	public static void main(String[] args) {
		//String[][] bookName = new String[2][3];
		// 1차원 배열을 여러개 담고 있는 공간이 2차원 배열이다.
		String[][][] bookName = {
			{ {"자바", "프로그래밍", "책1"}, {"Do it", "자바 기초", "입문서"} },
			{ {"자바2", "프로그래밍2", "책12"}, {"Do it2", "자바 기초2", "입문서2"} }
		};
		
		System.out.println(bookName.length);
		System.out.println(bookName[0].length);
		System.out.println(bookName[0][0].length);
		
		for(int i = 0; i < bookName.length; i++) {
			for(int j = 0; j < bookName[0].length; j++) {
				for(int k = 0; k < bookName[0][0].length; k++) {
					System.out.println(bookName[i][j][k]);
				}
			}
		}

	}

}
