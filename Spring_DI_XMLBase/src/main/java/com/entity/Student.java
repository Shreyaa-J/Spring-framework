package com.entity;

public class Student {
	private int stud_id;
	private String stud_name;
	private String branch;
	private College clg;

	public Student() {

	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", branch=" + branch + ", clg=" + clg + "]";
	}

}
