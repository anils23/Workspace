package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeWithList {

	public static void main(String[] args) {

		List<Employee> list = List.of(new Employee(101, "anil", 25000, Arrays.asList("pune", "banglore")),
				new Employee(103, "sanjay", 60000, Arrays.asList("mumbai", "delhi")),
				new Employee(102, "bharat", 24000, Arrays.asList("nashik", "chennai")),
				new Employee(102, "bharat", 24000, Arrays.asList("nashik", "chennai")));

		// stream sorted method
		// internally uses Comparable interface (compareTo method)
		// It is used to sort the records on the basis of Integer/Double values
		list.stream().sorted().forEach(System.out::println);

		// stream sorted method
		// internally uses Comparator interface (compare method)
		// It is used to sort the records on the basis of Integer/Double/String values
		list.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);

		// stream filter method
		// internally uses Predicate interface (test method)
		// It is used to filter the records based on the conditions
		list.stream().filter(e1 -> e1.getSalary() >= 25000).forEach(System.out::println);

		// stream distinct method
		// internally uses equals method of object class
		// It is use to get all the distinct records
		list.stream().distinct().forEach(System.out::println);

		// stream findAny method
		// It is used to randomly choose one record from all the records
		list.stream().findAny().ifPresent(System.out::println);

		// stream findFirst method
		// It is used to return first record from all the records
		list.stream().findFirst().ifPresent(System.out::println);

		// stream dropWhile method
		// internally uses Predicate interface (test method)
		// It is used to delete records on the based on the conditions
		list.stream().dropWhile(e1 -> e1.getSalary() >= 25000).forEach(System.out::println);

		/*
		 * stream anyMatch method internally uses Precidate interface (test method) It
		 * is used to check if any record matches with given data. If matches then
		 * returns true else returns false
		 */
		boolean anyMatch = list.stream().anyMatch(e1 -> e1.getName().equalsIgnoreCase("anil"));

		/*
		 * stream anyMatch method internally uses Precidate interface (test method) It
		 * is used to check if all the record matches with given data. If matches then
		 * returns true else returns false
		 */
		boolean allMatch = list.stream().allMatch(e1 -> e1.getName().equalsIgnoreCase("anil"));

		// stream forEach method
		// It is used to iterate through all records
		list.stream().forEach(System.out::println);

		// stream collect method
		// It is used to collect all the data in the new list or set.
		List<Employee> collect = list.stream().distinct().collect(Collectors.toList());

		// stream map method
		// internally uses Function interface (apply method)
		// It is used to get new Stream from the existing Stream
		// one to one mapping
		list.stream().map(Employee::getName).forEach(System.out::println);

		// stream flatMap method
		// internally uses Function interface (apply method)
		// It is used to get new Stream from the Stream<Stream>
		// one to many mapping
		list.stream().flatMap(e1 -> e1.getAddress().stream()).forEach(System.out::println);

	}

}
