package com.yozo.admin.dto;

public class AdminDto {
	
	private int member_no;
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_nick;
	private int member_birth;
	private String member_email;
	private String member_enabled;
	private String member_phone;
	private String member_addr;
	private String member_role;
	
	public AdminDto() {
		
	}
	public AdminDto(int member_no, String member_id, String member_pw, String member_name,
			String member_nick, int member_birth, String member_email,
			String member_enabled, String member_phone, String member_addr, String member_role) {
		
		this.member_no = member_no;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_nick = member_nick;
 		this.member_birth = member_birth;
		this.member_email = member_email;
		this.member_enabled = member_enabled;
		this.member_phone = member_phone;
		this.member_addr = member_addr;
		this.member_role = member_role;
		
	}
	
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}
	public int getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(int member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_enabled() {
		return member_enabled;
	}
	public void setMember_enabled(String member_enabled) {
		this.member_enabled = member_enabled;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}
	public String getMember_role() {
		return member_role;
	}
	public void setMember_role(String member_role) {
		this.member_role = member_role;
	}
	
	
	
	
}
