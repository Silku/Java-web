package chapter4;

public class ArrayEx5 {
//2차원 배열
//3차원 이상의 배열을 다차원 배열이라고 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [][] bookName = new String[2][3];
		// 1차원 배열을 여러개 담고 있는 공간이 2차원 배열이다.
		
		String[][][] bookName = {
				{ { "자바1", "프로그밍2", "책3" }, { "Do it4", "자바 기초5", "입문서6" } } , 
				{ { "자바a", "프로그밍b", "책c" }, { "Do itd", "자바 기초e", "입문서f" } }
		};
		System.out.println(bookName.length);  		// 2차원 배열의 길이를 의미
		System.out.println(bookName[0].length);  	//	1차원 배열의 길이를 의미 안쪽 {} 자바~책1 같은문자열있는곳
		System.out.println(bookName[0][0].length);
		for(int i = 0; i<bookName.length; i++) {
			for(int j = 0; j <bookName[0].length; j++) {
				for (int k = 0; k < bookName[0][0].length; k++) {
					System.out.println(bookName[i][j][k]);
				}
			}
		}
		
		
		}

}
