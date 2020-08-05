package com.yozo.broadcast.dto;

import java.sql.Date;

public class CalDto {

	private int seq;
	private String id;
	private String title;
	private String content;
	private String mdate;
	private Date regdate;

	public CalDto() {

	}
	public CalDto(int seq) {	
		this.seq = seq;
	}
	public CalDto(String title, String content, int seq) {	
		this.title = title;
		this.content = content;
		this.seq = seq;
	}
	public CalDto(String id, String title, String content, String mdate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.mdate = mdate;
	}

	public CalDto(int seq, String id, String title, String content, String mdate, Date regdate) {

		this.seq = seq;
		this.id = id;
		this.title = title;
		this.content = content;
		this.mdate = mdate;
		this.regdate = regdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
