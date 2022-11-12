package com.te.dateandtimeapi;

import java.time.format.DateTimeFormatter;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate.Property;
import org.joda.time.LocalDateTime;

public class Test {
	
	
	public static void main(String[] args) {
		
	LocalDate localDate = new LocalDate();
	System.out.println(localDate);
	
	LocalTime localTime = new LocalTime();
	System.out.println(localTime);
	
	LocalDateTime localDateTime = new LocalDateTime();
	System.out.println(localDateTime);	
	
	
	}

}
