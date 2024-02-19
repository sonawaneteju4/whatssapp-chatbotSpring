package com.whatsappbot.app.bean;

public class WhatsAppChange {
    private WhatsAppValue value;

	public WhatsAppValue getValue() {
		return value;
	}

	public void setValue(WhatsAppValue value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "WhatsAppChange [value=" + value + "]";
	}

	public WhatsAppChange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WhatsAppChange(WhatsAppValue value) {
		super();
		this.value = value;
	}

}
