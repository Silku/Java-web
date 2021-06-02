package chapters10_2;

import java.util.Collection;
import java.util.Iterator;

/**
 * 컬렉션 프레임워크
 * 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 
 * 데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현 , java interface로 구현.
 * list ,set, map 인터페이스  , 아래 (i)는 interface,  (Gc)는 GenericClass
 * List(i)   <- Collection(i)
 * -ArrayList(Gc)
 * -LinkedList(Gc)
 * index 기준으로 동작 ; 배열에있는 그 인덱스(색인,목록)
 * 
 * Set(i) 	<- Collection(i)
 * -Hashset(Gc)
 * -TreeSet(Gc)
 * value값 기준으로 동작
 * 
 * Map(i)
 * -HashMap(Gc)
 * -TreeMap(Gc)
 * key값과 value값이 쌍으로 이루어진 상태에서 동작
 * list , set - > collection을 상속받음 , map은 예외
 *
 */

public abstract class CollectionEx<E> implements Collection<E> {
	@Override
	public boolean add(E e) {
		// Collection에 객체를 추가
		return false;
	}
	@Override
	public void clear() {
		//모든 객체를 제거.
	}
	@Override
	public Iterator<E> iterator() {
		//순환할 반복(Iterator)을 반환
		return null;
	}
	@Override
	public boolean remove(Object o) {
		//매개변수에 해당하는 인스턴스가 존재하면 제거
		return false;
	}
	@Override
	public int size() {
		//Collection에 있는 요소의 개수를 반환.
		return 0;
	}
}
