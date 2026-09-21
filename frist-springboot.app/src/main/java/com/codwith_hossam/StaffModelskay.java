package com.codwith_hossam;

import java.util.UUID; //مش متكرار تاني   id	دي بتدني 

import jakarta.validation.constraints.NotBlank;

public class StaffModelskay {
	 private String id;
	 @NotBlank(message = "Staff name can not be blink")
     private String staffname;
	 @NotBlank(message = "Staff Title can not be blink")
     private String staffTitle;  //شغال ايي 
     private double staaffSalary;
     
     
	 public StaffModelskay(String id, String staffname, String staffTitle, double staaffSalary) {
		this.id = id;
		this.staffname = staffname;
		this.staffTitle = staffTitle;
		this.staaffSalary = staaffSalary;
	 }

	 public String getId() {
		 return id;
	 }

	 public void setId(String id) {
		 this.id = id;
	 }
public StaffModelskay() {
    	 this.id=UUID.randomUUID().toString();// افتراضي علطول من غير ما انا احطها  id  انا لما استدعي الكلاس دي اتوماتك بينفذ الكونستراكتور الافتراضي اللي هو فاضي دي فا لما ياجي ينشاء هيحط قيمت ال   
     }
	 

	 public String getStaffname() {
		 return staffname;
	 }

	 public void setStaffname(String staffname) {
		 this.staffname = staffname;
	 }

	 public String getStaffTitle() {
		 return staffTitle;
	 }

	 public void setStaffTitle(String staffTitle) {
		 this.staffTitle = staffTitle;
	 }

	 public double getStaaffSalary() {
		 return staaffSalary;
	 }

	 public void setStaaffSalary(double staaffSalary) {
		 this.staaffSalary = staaffSalary;
	 }

}
