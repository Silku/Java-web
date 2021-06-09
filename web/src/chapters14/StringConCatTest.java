package chapters14;

public class StringConCatTest {

	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		StringConcat<String, Integer> s = (str1, str2) ->{
				int i_num1 = Integer.parseInt(str1);
				int i_num2 = Integer.parseInt(str2);
				return i_num1 + i_num2;
		};
			System.out.println(s.makeString(a,b));
	}

}
