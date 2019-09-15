package com.c.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

import com.c.bean.Event;

public class ManageEvent {
	
	TreeSet<Event> events = new TreeSet<Event>(new MyComparator());
	Scanner sc = new Scanner(System.in);
	public void StoreEvent() throws FileNotFoundException {
		Event e;
		   System.out.println("Enter the Event Id");
		   int id = sc.nextInt();
		   System.out.println("Enter the event description");
		   String desc = sc.next();
		   System.out.println("Enter the event title");
		   String title = sc.next();
		   System.out.println("Enter the event date");
		   String s = sc.next();
		   Date date = null;
		   try {
			 date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
        e = new Event(id, desc, title,date) ;
        events.add(e);
//        sc.close();
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("event.txt"), true));
		pw.print(e);
		pw.println();
		pw.close();
        
        
	}
	public void RetrieveEvent() throws IOException, MyException {
		System.out.println("Enter the event id to be fetched: ");
		String st = null;
		st = sc.next();
		BufferedReader br = new BufferedReader(new FileReader("event.txt"));
		String line = br.readLine();
		boolean found = false;
		while(line!=null) {
			String[] s1 = line.split(" ");
			for(String s:s1) {
				String[] s2 = s.split("=");
				if(s2[0].equals("eventId") && s2[1].equals(st)) {
					found = true;
					System.out.println(line);
					break;
				}
			}
			line = br.readLine();
			if(found==true) {
				break;
			}
		}
		if(found==false) {
			throw new MyException("Object NOT Found");
		}
	}
}