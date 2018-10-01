package models;

import java.io.Serializable;

public class EventDetails implements Serializable{
	private String typeOfEvent, date, startTime, endTime, address,venue, scale, budget,
	phone, name, email, purpose, plateBudget, foodPreference, menu, celebrity, arrangements;
	private int avgNoOfPeople, eventId, ageGroup;
	
	
	
	public String getCelebrity() {
		return celebrity;
	}

	public void setCelebrity(String celebrity) {
		this.celebrity = celebrity;
	}

	public String getArrangements() {
		return arrangements;
	}

	public void setArrangements(String arrangements) {
		this.arrangements = arrangements;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getFoodPreference() {
		return foodPreference;
	}

	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EventDetails() {

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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		System.out.println("Setter purpose:" + purpose);
		this.purpose = purpose;
	}

	public int getAvgNoOfPeople() {
		return avgNoOfPeople;
	}

	public void setAvgNoOfPeople(int avgNoOfPeople) {
		this.avgNoOfPeople = avgNoOfPeople;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(int ageGroup) {
		System.out.println("Setter age group: " + ageGroup);
		this.ageGroup = ageGroup;
	}

	public String getPlateBudget() {
		return plateBudget;
	}

	public void setPlateBudget(String plateBudget) {
		this.plateBudget = plateBudget;
	}
	
}
