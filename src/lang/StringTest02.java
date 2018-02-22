package lang;

public class StringTest02 {

	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
		
		str2 = str3.toUpperCase();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str2.concat("??");
		System.out.println(str2);
		System.out.println(str4);
		
		// s.equals("male") -> "male".equals(s); 안정된 코드
		// s 널이 나올경우 널포인터 예외 발생
		
		// Method Chain - > 객체를 리턴해서 계속 연결해서 메소드 사용
		String str5 = "!".concat(str2).concat("@");
		System.out.println(str5);
		
		
		
		
		
	}
}
