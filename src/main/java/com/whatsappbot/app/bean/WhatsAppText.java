package com.whatsappbot.app.bean;

public class WhatsAppText {
    private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "WhatsAppText [body=" + body + "]";
	}

	public WhatsAppText() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WhatsAppText(String body) {
		super();
		this.body = body;
	}



}
