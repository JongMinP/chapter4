package lang;

public class PointTest {

	
	public static void main(String[] args) {
		
		Point point = new Point();
		
		System.out.println(point.getClass().getName()); // 클래스 이름
		System.out.println(point.hashCode());  // 해시코드 값(해싱해서 나온 인티저 값)
		// 해싱 : 비정형적인 데이터를 인티저값으로 바꿈
		// 해싱 같은경우 성능 때문에 인티저 값을 바꿈
		// 인코딩 디코딩이랑 조금 다른 느낌
		
		
		// getClass().getName() + "@" + hashCode()
		System.out.println(point.toString());
		System.out.println(point); // String의 경우 hashCode,toString,equals가 오버라이딩이 되어있음
		
		System.out.println("====================");
		
//		String 객체와 비교
		
		
		String s1 = new String("hello");
		System.out.println(s1.getClass().getName());
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		System.out.println(s1);
		
		String s2 = new String("hello");
		System.out.println(s2.hashCode());
		// s1과 s1가 다른 객체인데 해시코드가 같다
		// 스트링은 해시코드를 오버라이드 했는데 String은 내용을 가지고 해시코드를 만들기 때문에 같음
		
		
		
		
		
	}
}
