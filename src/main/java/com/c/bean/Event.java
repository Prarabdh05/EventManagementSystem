package com.c.bean;

import java.util.Date;

public class Event {
private int eventId;
private String eventdesc;
private String eventtitle;
private Date eventdate;
public Event() {
	super();
	// TODO Auto-generated constructor stub
}
public Event(int eventId, String eventdesc, String eventtitle, Date date) {
	
	this.eventId = eventId;
	this.eventdesc = eventdesc;
	this.eventtitle = eventtitle;
	this.eventdate = date;
}
public int getEventId() {
	return eventId;
}
public void setEventId(int eventId) {
	this.eventId = eventId;
}
public String getEventdesc() {
	return eventdesc;
}
public void setEventdesc(String eventdesc) {
	this.eventdesc = eventdesc;
}
public String getEventtitle() {
	return eventtitle;
}
public void setEventtitle(String eventtitle) {
	this.eventtitle = eventtitle;
}
public Date getEventdate() {
	return eventdate;
}
public void setEventdate(Date eventdate) {
	this.eventdate = eventdate;
}
@Override
public String toString() {
	return "eventId=" + eventId + " eventdesc=" + eventdesc + " eventtitle=" + eventtitle + " eventdate="
			+ eventdate;
}


}
