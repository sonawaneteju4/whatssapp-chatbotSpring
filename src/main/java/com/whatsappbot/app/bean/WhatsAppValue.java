package com.whatsappbot.app.bean;

public class WhatsAppValue {
    private WhatsAppMessage messages;
    private WhatsAppMetadata metadata;
	public WhatsAppMessage getMessages() {
		return messages;
	}
	public void setMessages(WhatsAppMessage messages) {
		this.messages = messages;
	}
	public WhatsAppMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(WhatsAppMetadata metadata) {
		this.metadata = metadata;
	}
	@Override
	public String toString() {
		return "WhatsAppValue [messages=" + messages + ", metadata=" + metadata + "]";
	}
	public WhatsAppValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WhatsAppValue(WhatsAppMessage messages, WhatsAppMetadata metadata) {
		super();
		this.messages = messages;
		this.metadata = metadata;
	}

}
