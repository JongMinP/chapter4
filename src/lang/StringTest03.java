package lang;

public class StringTest03 {

	public static void main(String[] args) {

		String s = "abcAbcabcABC";

		// charAt
		char c = s.charAt(2);
		System.out.println(c);

		// indexOf
		System.out.println(s.indexOf("Abc")); // 처음에 나타나는
		System.out.println(s.indexOf("ab"));
		System.out.println(s.lastIndexOf("ab"));

		// relpace
		System.out.println(s.replace("bc", "12")); // 특정문자열
		System.out.println(s.replaceAll("bc", "12")); // 정규표현식 사용가능(패턴)

		// substring
		System.out.println(s.substring(3, 7)); // 3부터 7전까지

		// trim
		String str1 = "   ab cd    ";
		System.out.println("---" + str1 + "---");
		System.out.println("---" + str1.trim() + "---"); // 앞뒤 공백제거

		// case
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		// split
		String[] tokens = str1.trim().split(" ");

		for (String token : tokens) {
			System.out.println(token);
		}

		tokens = "abcdefg".split(","); // 그대로 튀어나옴
		for (String token : tokens) {
			System.out.println(token);
		}

		tokens = "".split(","); // null 걱정 안해도됨
		System.out.println(tokens.length);

		
		
		
	}

}
