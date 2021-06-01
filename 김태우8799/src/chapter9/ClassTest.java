package chapter9;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		
//		데이터베이스에서 많이 쓴다. mysql, mssql, oracle 여러 db가 존재하지만 각각클래스가 달라요. 다르면 그때마다 새로 객체를 생성해야될까요?
// 		
		Class pClass3 = Class.forName("chapter9.Person");
		System.out.println(pClass3.getName());
	}

}
