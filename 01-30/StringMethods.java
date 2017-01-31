public class StringMethods {
	public static boolean endsWithRep(String s1, String s2, int n) {
		String suffix = "";
		for (int i = 0; i < n; i++) {
			suffix += s2;
		}
		return s1.endsWith(suffix);
	}

	public static void main(String[] args) {
		System.out.println(endsWithRep("foobarbar", "bar", 2));
		System.out.println(endsWithRep("foobarbar", "baz", 1));
	}
}
