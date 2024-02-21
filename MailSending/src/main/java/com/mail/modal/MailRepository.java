package com.mail.modal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailRepository {
	
	private String subject;
	private String message;
	public String getSubject() {
		System.out.println("message for the user");
		return null;
	}
	public String getMessage() {
		System.out.println("receive the messgae");
		return null;
	}

}
