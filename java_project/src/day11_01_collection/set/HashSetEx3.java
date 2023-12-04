package day11_01_collection.set;

//import java.lang.*; 자동 임포트 받고 있었다.
import java.util.HashSet;
import java.util.Set;

class Person {//extends Object{ //자동 오브젝트 클래스 상속 받고 있었다.
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age; //이름과 나이까지 같으면 거르기 위함
		//return Object.hash(name, age); //위와 같은 의미
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	
	
	
}//Person class end

public class HashSetEx3 {
	public static void main(String[] args) {
//		Set set = new HashSet();
//		
//		Person ps = new Person("aaa", 10);
//		set.add(ps);
//		
//		set.add(new Person("David", 10));
//		set.add(new Person("David", 20));
//		set.add(new Person("David", 20));
//		
//		System.out.println(set);
		
		A a = new A();
		B b = new B();
		A bb = new B();
//		B aa = new A(); //false
		
		System.out.println(b instanceof A); //b가 A로 객체 생성이 되느냐?
		System.out.println(b instanceof B);
		System.out.println(a instanceof A); //a가 A로 객체 생성이 되느냐?
		System.out.println(a instanceof B); //false
		//A가 B의 하위 클래스이거나 B 클래스의 인스턴스라면 위의 코드는 true를 출력
		

	}
}


class A{
	String name;
}

class B extends A{
	
}
