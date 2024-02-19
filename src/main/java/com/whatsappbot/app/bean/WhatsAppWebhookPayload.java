package com.whatsappbot.app.bean;

import java.util.List;

public class WhatsAppWebhookPayload {
    private String object;
    private List<WhatsAppEntry> entry;
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public List<WhatsAppEntry> getEntry() {
		return entry;
	}
	public void setEntry(List<WhatsAppEntry> entry) {
		this.entry = entry;
	}
	@Override
	public String toString() {
		return "WhatsAppWebhookPayload [object=" + object + "]";
	}
	public WhatsAppWebhookPayload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WhatsAppWebhookPayload(String object, List<WhatsAppEntry> entry) {
		super();
		this.object = object;
		this.entry = entry;
	}

    
}
