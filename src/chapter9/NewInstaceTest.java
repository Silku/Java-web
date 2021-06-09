package chapter9;

public class NewInstaceTest {

	public static void main(String[] args) throws ClassNotFoundException, 
		InstantiationException, IllegalAccessException {
		
		Class pClass = Class.forName("chapter9.Person");
		Person person2 = (Person)pClass.newInstance();
		person2.setName("±Ë¡ÿ¿œ");
		System.out.println(person2.getName());
	}
}
