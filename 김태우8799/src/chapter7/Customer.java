package chapter7;
//C++�� C#������  public class Customer extends People, Student ���������� ���߻���� �����ϴ�. �׷���
//�ڹٿ����� ���ϻ�Ӹ� �����ϴ�. 
public class Customer extends People {
	private int customerId;  			//ȸ����ȣ
	private String customerName;	//���̸�
	private String customerGrade;	//�����	
	private int bonusPoint; 			//���ʽ�����Ʈ
	private double bonusRatio;		//��������

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
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int id, String name) {
		customerId = id;
		customerName = name;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� "
				+ bonusPoint + "�Դϴ�.";
	}
}

