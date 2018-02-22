package lang;

public class EqualsTest {

	public static void main(String[] args) {

		Point point1 = new Point(10, 20);
		Point point2 = new Point(10, 20);
		Point point3 = point2;

		// == 연산자에서 두 개의 항이 객체 참조 변수인 경우
		// 두 객체의 동일 여부(동일성)
		System.out.println(point1 == point2); // 참조하는 값이 다르기 때문에
		System.out.println(point2 == point3);

		// 두 객체의 동질성(내용) 비교를 할때에는 equals
		// 메소드를 사용한다.
		// equals가 오버라이드가 안된 경우에는 == 연산자와
		// 결과가 동일 하다.
		// equals의 기본 구현은 해시코드 비교 이다.
		System.out.println(point1.equals(point2)); // 오버라이드 안하면 false
		System.out.println(point2.equals(point3));

		System.out.println("=======================");

		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s2;

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));

		// hashCode() 비교
		System.out.println(s1.hashCode()); // 값기반 해시코드
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1)); // 래퍼런스아이디 기반? 추측
		System.out.println(System.identityHashCode(s2));

		// literal
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str2;
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		// 리터럴로 만들 경우 상수풀에 래퍼런스 아이디 , 해시 코드르 저장하고 
		// 상수풀에 존재하는 경우 상수풀에 있는 것을 가져다 쓴다.
		// 메모리 아낄려고 함
		
		// String 객체는 변경 불가함 연결되는 객체가 바뀔 뿐이다.

	}

}
