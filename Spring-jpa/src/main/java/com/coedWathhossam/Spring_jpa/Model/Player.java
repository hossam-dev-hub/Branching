package com.coedWathhossam.Spring_jpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity   // اني الكلاس دي جدول في قاعده البيانات  Spring   كده انا عرفت ال    
public class Player {
  
	@Id //Id يعني مش هيتكرار انا هنا عرفت اني ال   Primary Key اعرف عمود انو  Entity لازم جوه ال 
	private long id;
	private String name;
	private int Score;
	 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
}
