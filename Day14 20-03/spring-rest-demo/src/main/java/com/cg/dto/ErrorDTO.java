package com.cg.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDTO {
	private String errorMessage;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate now;
	private String uri;
	
	public ErrorDTO() {
	}
	
	public ErrorDTO(String errorMessage, LocalDate now, String uri) {
		super();
		this.errorMessage = errorMessage;
		this.now = now;
		this.uri = uri;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LocalDate getNow() {
		return now;
	}
	public void setNow(LocalDate now) {
		this.now = now;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
