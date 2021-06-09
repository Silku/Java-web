package chapters10_2;

import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * List(i) <- Collection(i)
 * - ArrayList(Gc)
 * - LinkedList(Gc)
 * index�������� ����
 * 
 * Set(i) <- Collection(i)
 * - HashSet(Gc)
 * - TreeSet(Gc)
 * value�� �������� ����
 * 
 * Map(i)
 * - HashMap(Gc)
 * - TreeMap(Gc)
 * key���� value���� ������ �̷��� ���¿��� ����
 *
 */

public abstract class CollectionEx<E> implements Collection<E> {
	@Override
	public boolean add(E e) {
		// Collection�� ��ü�� �߰�.
		return false;
	}
	
	@Override
	public void clear() {
		// ��� ��ü�� ����.
	}
	
	@Override
	public Iterator<E> iterator() {
		// ��ȯ�� �ݺ�(Iterator)�� ��ȯ.
		return null;
	}
	
	@Override
	public boolean remove(Object o) {
		//�Ű������� �ش��ϴ� �ν��Ͻ��� �����ϸ� ����.
		return false;
	}
	
	@Override
	public int size() {
		//����� ������ ��ȯ.
		return 0;
	}

}





