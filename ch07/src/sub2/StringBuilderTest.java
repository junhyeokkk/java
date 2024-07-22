package sub2;

public class StringBuilderTest {
	public static void main(String[] args) {
		// String 불변(immutable) 특성
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str));

		str += "Programming";
		System.out.println("str 주소 : " + System.identityHashCode(str));

		System.out.println("str : " + str);

		// String의 불변 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");

		System.out.println("sb 주소 : " + System.identityHashCode(sb));

		sb.append("Programming");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));

		System.out.println("sb : " + sb);


	}
}
