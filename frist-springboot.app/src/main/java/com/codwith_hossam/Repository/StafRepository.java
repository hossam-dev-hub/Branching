package com.codwith_hossam.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.codwith_hossam.StaffModelskay;
//@Component
@Repository      //@Component  بدال ال 
public class StafRepository {
	
	private List<StaffModelskay> AllStaff = new ArrayList<>();
	
	public StaffModelskay getStaffByIndex(int index) {
		return AllStaff.get(index);
	}
	
	public void addStaf(StaffModelskay Staf) {
		AllStaff.add(Staf);
	}
	public void Updatestaf(StaffModelskay staf,int index) {
		AllStaff.set(index, staf);
	}
	
	public List<StaffModelskay> getAllstaf(){
		return AllStaff;
	}

}
