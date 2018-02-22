package lang;

public class SBTest {

	public static void main(String[] args) {
		// 생성
		StringBuffer sb1 = new StringBuffer(10); // 크기 잡거나
		StringBuffer sb = new StringBuffer("This"); // 초기 문자

		System.out.println(sb.length() + ":" + sb.capacity()); // 실제 문자열의 길이 , 버퍼의 사이즈
		System.out.println(sb);

		// 문자열 추가
		sb.append(" is pencil"); // 자기자신을 리턴함 (메서드 체이닝)
		System.out.println(sb);

		// 삽입
		sb.insert(7, " my"); // 뒤로 밀림
		System.out.println(sb);
		
		// 치환
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		// 버퍼 크기 조정
		sb.setLength(3);
		
		System.out.println(sb);

		String s1 = "Hello" + "world" + 10 + true;
		String s2 = 
				new StringBuffer("Hello")
				.append("world")
				.append(10)
				.append(true)
				.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
