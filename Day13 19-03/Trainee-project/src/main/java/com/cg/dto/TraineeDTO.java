package com.cg.dto;

public class TraineeDTO {
   private int tid;
   private String tName;
   private String tDomain;
   private String tLocation;
   
   public TraineeDTO() {
}
   public TraineeDTO(int tid, String tName, String tDomain, String tLocation) {
	super();
	this.tid = tid;
	this.tName = tName;
	this.tDomain = tDomain;
	this.tLocation = tLocation;
}
   public int getTid() {
	return tid;
   }
   public void setTid(int tid) {
	this.tid = tid;
   }
   public String gettName() {
	return tName;
   }
   public void settName(String tName) {
	this.tName = tName;
   }
   public String gettDomain() {
	return tDomain;
   }
   public void settDomain(String tDomain) {
	this.tDomain = tDomain;
   }
   public String gettLocation() {
	return tLocation;
   }
   public void settLocation(String tLocation) {
	this.tLocation = tLocation;
   }
   
}
