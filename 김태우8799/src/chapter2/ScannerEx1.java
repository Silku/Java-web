package chapter2;
//표준입력
import java.util.Scanner; //ctrl + shift + o 하면 이거 생성됨 신기신기 아마 Scanner 자료형이 쓰였을때 가능한기능인듯..?

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//컨트롤 누르고 Scanner 자료형 좌클릭해보면 라이브러리 내에있는 설명서 위치로 이동함 겁나 신기한기능
		String str = null; 
		
		str = sc.nextLine();
		//nextLine은 사용자의 입력을 기다림.
		System.out.println("입력하신 정보는 " + str + "입니다.");
		
	}

}
