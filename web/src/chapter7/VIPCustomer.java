package chapter7;

public class VIPCustomer extends Customer {
	private int agentId;	//VIP를 관리해주는 담당 사원의 아이디
	private double saleRatio;	//VIP 할인율
	
	public VIPCustomer(int id, String name, int agentId) {
		super(id, name);
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);		//5%를 적립
		saleRatio = 0.1;				//10% 할인
		this.agentId = agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		super.setBonusPoint(super.getBonusPoint() + (int)(price * super.getBonusRatio()));
		return price - (int)(price * saleRatio);
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
