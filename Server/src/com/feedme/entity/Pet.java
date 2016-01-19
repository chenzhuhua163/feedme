package com.feedme.entity;
// Generated 2016-1-19 19:51:38 by Hibernate Tools 4.3.1.Final

/**
 * Pet generated by hbm2java
 */
public class Pet implements java.io.Serializable {

	private Integer petId;
	private User user;
	private int petHunger;
	private int petClean;
	private int petMood;
	private int petHealth;

	public Pet() {
	}

	public Pet(User user, int petHunger, int petClean, int petMood, int petHealth) {
		this.user = user;
		this.petHunger = petHunger;
		this.petClean = petClean;
		this.petMood = petMood;
		this.petHealth = petHealth;
	}

	public Integer getPetId() {
		return this.petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPetHunger() {
		return this.petHunger;
	}

	public void setPetHunger(int petHunger) {
		this.petHunger = petHunger;
	}

	public int getPetClean() {
		return this.petClean;
	}

	public void setPetClean(int petClean) {
		this.petClean = petClean;
	}

	public int getPetMood() {
		return this.petMood;
	}

	public void setPetMood(int petMood) {
		this.petMood = petMood;
	}

	public int getPetHealth() {
		return this.petHealth;
	}

	public void setPetHealth(int petHealth) {
		this.petHealth = petHealth;
	}

}