package com.te.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

//		List<Employee> list = Arrays.asList(new Employee("anil", 101, 25000), new Employee("sanjay", 102, 25000),
//				new Employee("bharat", 104, 500000), new Employee("bharat", 103, 1000000));

//		Comparator<Employee> com = (o1, o2) -> {
//			return o1.getSalary().compareTo(o2.getSalary());
//		};
//
//		Collections.sort(list, com);
//		System.out.println(list.get(list.size() - 1));
//
//		// using stream & comparator
//
//		Optional<Employee> max = list.stream().max(com);
//		System.out.println(max.get() + "=====");
//
//		// using stream & function
//
//		Function<Employee, Double> f = (e) -> {
//			return e.getSalary();
//		};
//
//		list.stream().max(Comparator.comparing(f)).ifPresent(System.out::println);
//		list.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
//
//		Predicate<Employee> p = (e) -> {
////		   if (e.getSalary()>50000) {
////			return true;
////		}else {
////			return false;
////		}
//			return e.getSalary() > 50000;
//		};
//
//		System.out.println("==========================================");
//		List<Employee> collect = list.stream().filter(p).collect(Collectors.toList());
//
//		for (Employee employee : collect) {
//			System.out.println(employee);
//		}
//
//		list.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
//
//		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//		System.out.println("======================");
//
//		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
//		boolean anyMatch = list.stream().anyMatch(e -> e.getName().equals("anil"));
//		System.err.println(anyMatch);
//		
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(asList);
		
		List<Integer> collect = asList.stream().filter(n->n%2==0).collect(Collectors.toList());
		for (Integer integer : collect) {
			System.out.println(integer);
		}
		

	}

}
