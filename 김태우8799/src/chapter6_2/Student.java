package chapter6_2;

//매개 : 중간에서 연결 - 전달을 도와주는 역할 매개채 그런거 얘기하자나요 그죠 중간에서 값을 넘겨주기 위해서 넘겨주고 넘겨받기위해서 있는거에요 매개변수라는게
//그러면은 일단 디스스튜던트메인 디스 스튜던크 이렇게 되는거죠 이렇게되는겁니다.이것을 ㅇ ㅓ디서 넘겨주냐면요.
//자 클새스새로만들게여 ㅋ 클래스 만들어서 

public class Student {
	private String studentName;
	
	private int money;
	
	public Student(String name, int money) {
			this.studentName = name;
		
			this.money = money;
			
	}
	public void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
		
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;	
	}
	public void getoffBus(Bus bus) {
		bus.getoff();
	}
	public void getoffSubway(Subway subway) {
		subway.getoff();
	}
	
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "원입니다.");
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}


	
}
