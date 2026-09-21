package com.codwith_hossam.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codwith_hossam.StaffModelskay;
import com.codwith_hossam.Repository.StafRepository;
//@Component
@Service    //@Component  بدال ال 
public class StaffService {
	
//	StafRepository stafRepository = new StafRepository();
	@Autowired
	StafRepository stafRepository;
	public StaffModelskay getStaffByIndex(int index) {
		return stafRepository.getStaffByIndex(index);
	}
	 
	public StaffModelskay getStaffById(String id) {
		int index= getStaffIndex(id);
		return index == -1 ? new StaffModelskay(): getStaffByIndex(index);
	}
	
	public void addStaf(StaffModelskay Staf) {
		stafRepository.addStaf(Staf);
	}
	public void Updatestaf(StaffModelskay staf,int index) {
		stafRepository.Updatestaf(staf, index);
	}
	
	public List<StaffModelskay> getAllstaf(){
		return stafRepository.getAllstaf();
	}
	public int getStaffIndex(String id) {
		 for(int i=0; i<getAllstaf().size() ;i++) {
			 
			 if(getStaffByIndex(i).getId().equals(id)) return i;
		 }
		 return -1;
	 }
	public void SubmitStaff(StaffModelskay stafkay) {
		int index =getStaffIndex(stafkay.getId());
	    if(index == -1) {
	    	addStaf(stafkay);
	    }
	    else {
	     
	    Updatestaf(stafkay, index);
	    }
	}


}
