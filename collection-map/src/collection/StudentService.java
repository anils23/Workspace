package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
	
	public static void main(String[] args) {
		
//		List<Students> list = Arrays.asList(new Students(106,"hrushi", 25),new Students(101,"anil",23), new Students(19,"ravi", 24));
//		
//		for (Students students : list) {
//			System.out.println(students);
//		}
//		System.out.println("================================");
		
//		Collections.sort(list);
	
//		Collections.sort(list,(s1,s2)-> s1.getName().compareTo(s2.getName()));
		
//		List<Students> list2 = list.stream().sorted((s1,s2)-> s1.getName().compareTo(s2.getName())).toList();
//		
//		for (Students students : list2) {
//			System.out.println(students);
//		}
	
				
		Map<Integer,Students> map = new HashMap<>();
		map.put(101, new Students(106,"hrushi", 25));
		map.put(106, new Students(104,"anil", 25));
		map.put(103, new Students(109,"ravi", 25));
		
	   System.out.println(map);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("=========");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue((s1,s2)->s1.getName().compareTo(s2.getName()))).forEach(System.out::println);
		
	}

}
