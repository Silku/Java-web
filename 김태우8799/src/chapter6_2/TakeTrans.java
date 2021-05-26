package chapter6_2;

public class TakeTrans {
// 스튜던트 값에 요값요값요값줬죠 요기요기요기값이 들어온다구요 김준일 아까 2만원 그 값이 들어요죠 그럼 네임이람 그레이드랑 머니에 들어있죠 이값을 클래스의 변수에
	//집어 넣어주겠다는 거빈다 . 이게 생성자의 동작 매개변수 이해못하면은 클래스 힘들어집니다. 메서드 메서드가 이해가 되야되요. 전체적인 동작이 이해가 됩니다.
	//킴이라고 하는 학생을 학생에게 요러한 값을 넣어주기 위해서, 자 그럼 스튜던드
	public static void main(String[] args) {
		Student kim = new Student("김준일", 20000);  
		Student lee = new Student("이은수", 40000);  
		Student kim2 = new Student("김태우", 60000);
		Bus b = new Bus("43다 1317");
		Bus b2 = new Bus("11카 7777");
		Subway s = new Subway("1호선"); 
		Subway s2 = new Subway("2호선"); 

		kim.showInfo();
		
		kim.takeBus(b);
		b.showInfo();
		kim.showInfo();
		kim.getoffBus(b);
		b.showInfo();
		System.out.println();
		kim.takeSubway(s2);
		s2.showInfo();
		kim.getoffSubway(s2);
		kim.showInfo();
		kim.setMoney(20000);
		kim.showInfo();
	}
}
