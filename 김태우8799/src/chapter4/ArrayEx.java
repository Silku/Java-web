package chapter4;

public class ArrayEx {

	//배열 같은 변수명으로 여러 데이터를 저장할 수 있게 도와주는 자료형
	//자료형의 묶음.
	//int, char , double, String
	//int = 10; 
	//int [] num = {10, 20};
	//int [] num = new int[2];
	//int [] num;
	//num = new int[2];
	//[] 는 인덱스 연산자
	String select1;
	String select2;
	String[] select = new String[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//여러 변수 일일히 쓰기 불편,
//		int num1 = 1;
		
		//이건 안되고
//		int[]num=;
//		num = {1,2,3,4,5,6,7,8,9,10};
		
		//이건 됩니다. 컴파일러도 한줄로 읽어서(?)
//		int[] num ={1,2,3,4,5,6,7,8,9,10};
		
		//원래라면 아래와 같이 써져야됨.
		//int[]num = new int[10]; 
		//for(int i = 0; i < num.length; i++){ num[i] = i+1;}
	}

}
