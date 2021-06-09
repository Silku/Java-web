package chapters10_2;

import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * List(i) <- Collection(i)
 * - ArrayList(Gc)
 * - LinkedList(Gc)
 * index기준으로 동작
 * 
 * Set(i) <- Collection(i)
 * - HashSet(Gc)
 * - TreeSet(Gc)
 * value값 기준으로 동작
 * 
 * Map(i)
 * - HashMap(Gc)
 * - TreeMap(Gc)
 * key값과 value값이 쌍으로 이루진 상태에서 동작
 *
 */

public abstract class CollectionEx<E> implements Collection<E> {
	@Override
	public boolean add(E e) {
		// Collection에 객체를 추가.
		return false;
	}
	
	@Override
	public void clear() {
		// 모든 객체를 제거.
	}
	
	@Override
	public Iterator<E> iterator() {
		// 순환할 반복(Iterator)를 반환.
		return null;
	}
	
	@Override
	public boolean remove(Object o) {
		//매개변수에 해당하는 인스턴스가 존재하면 제거.
		return false;
	}
	
	@Override
	public int size() {
		//요소의 개수를 반환.
		return 0;
	}

}





