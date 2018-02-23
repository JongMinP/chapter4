package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Value> set = new HashSet<>();

		// set은 순서가 없고 중복이 불가능
		Value v1 = new Value(10);
		Value v2 = new Value(5);
		Value v3 = new Value(1);
		Value v4 = new Value(10);

		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4); // 중복된 값이 들어가는 이유는 hashcode를 오버라이딩을 하지 않아서(equals도 해야됨)
		// 래퍼런스아이디로 비교하기 때문에 들어간다.

		// 존재여부
		System.out.println(set.contains(new Value(10)));
		
		//삭제
		set.remove(new Value(20)); // 발견되는애 다 삭제
		
		
		// 해시코드를 비교한후 이퀄스로 비교 하여 동일 여부 판별

		// 순회
		Iterator<Value> it = set.iterator();

		while (it.hasNext()) {
			Value v = it.next();
			System.out.println(v);
		}

	}
}
