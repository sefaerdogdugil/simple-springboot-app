package com.springboot.property;

import java.io.Serial;
import java.io.Serializable;

public class Property implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	
	private int noOfStudents;
	
	private String schoolName;

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
