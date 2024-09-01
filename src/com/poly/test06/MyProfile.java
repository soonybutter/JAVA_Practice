package com.poly.test06;

public class MyProfile extends Profile implements Display, Job {

	private String loc;
	
	public MyProfile() {}
	public MyProfile(String name, String phone) {
		super(name,phone);
		
	}
	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
		
		
	}

	@Override
	public void display() {
		super.printProfile();
		System.out.println("회사 주소: "+ loc);
		System.out.println("회사 직종: "+Job.jobId);
		
	}
	
	
	
	
	

}
