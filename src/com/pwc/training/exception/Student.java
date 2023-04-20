package com.pwc.training.exception;

public abstract class Student {
	
	private int studId;
	private int rollNo;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public abstract int getRoomNo() throws NumberFormatException;

}
