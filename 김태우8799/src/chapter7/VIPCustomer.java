package chapter7;
//���
public class VIPCustomer extends Customer{
		private int agentId;	//VIP�� �������ִ� ��� ����� ���̵�
		private double saleRatio;	//VIP ������
		
		public VIPCustomer(int id, String name, int agentId) {
			super(id, name);
			super.setCustomerGrade("VIP");
			super.setBonusRatio(0.05);		//5%�� ����
			saleRatio = 0.1;				//10% ����
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
			return super.getCustomerName() + "���� ����� " + super.getCustomerGrade() + "�̸�, ���ʽ� ����Ʈ�� " 
					+ super.getBonusPoint() + "�Դϴ�. �����մϴ�.";
		}
	}

	
	

//	private int bonusPoint;
//	private double bonusRatio;
//	
//	private int agentId; 		//VIP ���� ��� ����� ���̵�
//	private double saleRatio;	//VIP ������
//	
//	public VIPCustomer(int id, String name, int agentId) {
//		super(id, name);
//		super.setCustomerGrade("VIP");
//		super.setBonusRatio(0.05); //5%����
//		saleRatio = 0.1;		//10%����
//		this.agentId = agentId;
//	}
//	@Override
//	public int calcPrice(int price) {
//			super.setBonusPoint((int)super.getBonusPoint() + (int)(price * super.getBonusRatio()));
//			bonusPoint += price * bonusRatio;
//			return price - (int)(price*saleRatio);   //bonusRatio�� �����̴ϱ� �ٿ�ĳ������ ���ؼ� (int)���� 
//	}
//	public int getAgentID() {
//		return agentId;
//	}
//	@Override
//	public String showCustomerInfo() {
//		return super.getCustomerName() + "���� ����� " + super.getCustomerGrade() + "�̸�, ���ʽ� ����Ʈ�� " 
//				+ super.getBonusPoint() + "�Դϴ�. �����մϴ�.";
//	}
//	
//}


