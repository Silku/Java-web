package chapter7_a;
//상속
public class VIPCustomer extends Customer{
	private int bonusPoint;
	private double bonusRatio;
	
	private int agentId; 		//VIP 관리 담당 사원의 아이디
	private double saleRatio;	//VIP 할인율
	
	public VIPCustomer(String name) {
		super(name);
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05); //5%적립
		saleRatio = 0.1;		//10%할인
	}
	@Override
	public int calcPrice(int price) {
			super.setBonusPoint((int)super.getBonusPoint() + (int)(price * super.getBonusRatio()));
			bonusPoint += price * bonusRatio;
			return price - (int)(price*saleRatio);   //bonusRatio가 더블이니까 다운캐스팅을 위해서 (int)붙임 
	}
	public int getAgentID() {
		return agentId;
	}
	@Override
	public String showCustomerInfo() {
		return super.getCustomerName() + "님의 등급은 " + super.getCustomerGrade() + "이며, 보너스 포인트는 " 
				+ super.getBonusPoint() + "입니다. 감사합니다.";
	}
	
}