package chapter7_a;
//기존 7챕터 커스터머 소스코드 내용들 다 날라갈뻔해서 백업저장

//C++나 C#에서는  public class Customer extends People, Student 같은식으로 다중상속이 가능하다. 그러나
//자바에서는 단일상속만 가능하다. 
public class Customer extends People {
	private int customerId;  			//회원번호
	private String customerName;	//고객이름
	private String customerGrade;	//고객등급	
	private int bonusPoint; 			//보너스포인트
	private double bonusRatio;		//적립비율
	
	public Customer(String name) {
		super(name);
		customerName = super.name;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며 , 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
}
