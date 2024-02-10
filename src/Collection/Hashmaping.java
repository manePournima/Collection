package Collection;

public class Hashmaping {

	public static void main(String[] args) {

		String a = "adfadfafadf";
		String b = "fsgfdgfhgf";

		System.out.println(a.hashCode());
		System.out.println(a.hashCode()&15 );

		System.out.println(b.hashCode()&15 );
	}

}
