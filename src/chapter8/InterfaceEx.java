package chapter8;

/**
 * 
 * �������̽�
 * ��ӿ� ���� ����
 * ����� �ƴ϶� �����̴�. (implement)
 * ���� ��Ӱ� ���� ������ �����Ѵ�.
 * �⺻������ �޼ҵ��� ���´� abstract �޼ҵ� �̴�.
 * �Ϲ� �޼ҵ带 �����ϰ� ���� ������ default�� ����Ͽ� �����Ѵ�.
 * �⺻���� ���� ���´� ����̴�.
 * static ���� ������ �Ǿ� �ִ�.
 * static �޼ҵ嵵 ������ �����ϴ�.
 * �ڹ� 9���� ���ʹ� private �޼ҵ嵵 ����� �����ϴ�.
 */

public interface InterfaceEx {
	public void test();
	public default void test2() {
		System.out.println("����Ʈ �޼ҵ�");
	}
}
