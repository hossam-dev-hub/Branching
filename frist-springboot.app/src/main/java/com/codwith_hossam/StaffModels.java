package com.codwith_hossam;

public class StaffModels {
	 private int id;
     private String staffname;
     private String staffTitle;  //شغال ايي 
     private double staaffSalary;
     
     
     public StaffModels() {
    	 
     }
	 public StaffModels(int id, String staffname, String staffTitle, double staaffSalary) {
		this.id = id;
		this.staffname = staffname;
		this.staffTitle = staffTitle;
		this.staaffSalary = staaffSalary;
	 }

	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
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
