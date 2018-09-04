package models;

import java.io.Serializable;

public class EventDetails implements Serializable{
	private String typeOfEvent, date, timing, venue, scale, budget, phone, name, email;
	private int avgNoOfPeople, eventId;
	
	public EventDetails() {
		
	}
	
	public EventDetails(String name, String phone, String email, String typeOfEvent, String date, String timing, String venue, 
			String scale, String budget, int avgNoOfPeople, int eventId) {
		
		this.name 	 = name;
		this.phone 	 = phone;
		this.email 	 = email;
		this.date 	 = date;
		this.timing  = timing;
		this.venue 	 = venue;
		this.scale 	 = scale;
		this.budget  = budget;
		this.eventId = eventId;
		this.typeOfEvent 	= typeOfEvent;
		this.avgNoOfPeople 	= avgNoOfPeople;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeOfEvent() {
		return typeOfEvent;
	}

	public void setTypeOfEvent(String typeOfEvent) {
		this.typeOfEvent = typeOfEvent;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public int getAvgNoOfPeople() {
		return avgNoOfPeople;
	}

	public void setAvgNoOfPeople(int avgNoOfPeople) {
		this.avgNoOfPeople = avgNoOfPeople;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
}
