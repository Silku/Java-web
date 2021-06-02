package chapters10_2;

import java.util.Collection;
import java.util.Iterator;

/**
 * �÷��� �����ӿ�ũ
 * �ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� 
 * �����͸� �����ϴ� �ڷᱸ���� �����͸� ó���ϴ� �˰����� ����ȭ�Ͽ� Ŭ������ ���� , java interface�� ����.
 * list ,set, map �������̽�  , �Ʒ� (i)�� interface,  (Gc)�� GenericClass
 * List(i)   <- Collection(i)
 * -ArrayList(Gc)
 * -LinkedList(Gc)
 * index �������� ���� ; �迭���ִ� �� �ε���(����,���)
 * 
 * Set(i) 	<- Collection(i)
 * -Hashset(Gc)
 * -TreeSet(Gc)
 * value�� �������� ����
 * 
 * Map(i)
 * -HashMap(Gc)
 * -TreeMap(Gc)
 * key���� value���� ������ �̷���� ���¿��� ����
 * list , set - > collection�� ��ӹ��� , map�� ����
 *
 */

public abstract class CollectionEx<E> implements Collection<E> {
	@Override
	public boolean add(E e) {
		// Collection�� ��ü�� �߰�
		return false;
	}
	@Override
	public void clear() {
		//��� ��ü�� ����.
	}
	@Override
	public Iterator<E> iterator() {
		//��ȯ�� �ݺ�(Iterator)�� ��ȯ
		return null;
	}
	@Override
	public boolean remove(Object o) {
		//�Ű������� �ش��ϴ� �ν��Ͻ��� �����ϸ� ����
		return false;
	}
	@Override
	public int size() {
		//Collection�� �ִ� ����� ������ ��ȯ.
		return 0;
	}
}
