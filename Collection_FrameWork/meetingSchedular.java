package com.linkcode.collectionframework.Example;

import java.time.LocalDateTime;
import java.util.TreeSet;

public class meetingSchedular {
	
	static TreeSet<LocalDateTime> meetings=new TreeSet<LocalDateTime>();
	
	public static void main(String[] args) {
		scheduLeMeeting(LocalDateTime.of(2026, 4, 14, 11, 30));
		scheduLeMeeting(LocalDateTime.of(2026, 4, 14, 8, 30));
		scheduLeMeeting(LocalDateTime.of(2026, 4, 15, 9, 30));
		scheduLeMeeting(LocalDateTime.of(2026, 4, 14, 7, 00));
		scheduLeMeeting(LocalDateTime.of(2026, 4, 15, 7, 15));
		
		viewMeeting();
		
		System.out.print("First Meeting :");
		System.out.println(meetings.getFirst());
		System.out.print("Last Meeting :");
		System.out.println(meetings.getLast());
		System.out.println("Meeting from :"+LocalDateTime.of(2026, 4,15,6,30));
		System.out.println(meetings.tailSet(LocalDateTime.of(2026, 4,15,6,30)));
		
		
		
	}

	private static void viewMeeting() {
		meetings.forEach(val->System.out.println(val));
	}

	private static void scheduLeMeeting(LocalDateTime time) {
		meetings.add(time);
		System.out.println("Meeting Marked");
		
		
	}
	
}
