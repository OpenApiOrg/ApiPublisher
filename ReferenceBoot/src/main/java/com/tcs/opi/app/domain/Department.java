package com.tcs.opi.app.domain;

public class Department {

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", description=" + description	+ "]";
	}

	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String myDeptId) {
		this.deptId = myDeptId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String myDescription) {
		this.description = myDescription;
	}
	
	
	private String deptId;
	private String description;

}