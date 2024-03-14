package example;

import java.util.HashMap;

public class App {
	public static void main(String args[]) {
		HashMap<Student,String> map = new HashMap<>();
		Student student = new Student("Raushan");
		map.put(student, "Ranjan");
		System.out.println(map.get(student));
		Student student1 = new Student("Hello");
		map.put(student1, "World");
		System.out.println(map.get(student1));
		//student.setName("Ram");
		map.put(student, "Kumar");
		System.out.println(map.get(student));
		HashMap<String,String> map1 = new HashMap<>();
		map1.put("1", "2");
		System.out.println(map1.get("1"));
		String s1 = "Hello";
//		map1.put(s1, "3");
//		s1 = "Test";
//		System.out.println(map1.get(s1));
		int result = -5 % 3;
	    System.out.println(result);
	}
}
