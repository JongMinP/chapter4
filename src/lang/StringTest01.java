package lang;

public class StringTest01 {

	public static void main(String[] args) {

		// String은 내부가 변경되지 않는다.
		// 문자 " escape
		String s = "I say \"hello\"";
		System.out.println(s);

		// 문자 ' escape;
		char c = '\'';

		// 문자 \ escpae
		String path = "d:\\cafe24";
		System.out.println(path);

		// \t, \n ,\r, \b ..
		System.out.print("\n"); // newline

		// + 연산
		String s1 = "Hello" + "world";
		String s2 = "Hello";

		s2 += "world";

		char[] cs = s2.toCharArray();
		System.out.println(cs);

	}

}
