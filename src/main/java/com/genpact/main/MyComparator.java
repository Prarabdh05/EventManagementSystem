package com.genpact.main;

import java.util.Comparator;

import com.genpact.bean.Event;

public class MyComparator implements Comparator<Event> {
	public int compare(Event e1, Event e2) {
		    if(e1.getEventdate().before(e2.getEventdate()))
		        return -1;
		    else if(e1.getEventdate().after(e2.getEventdate()))
		        return 1;
		    else
		        return 0;
	}
}