package com.whatsappbot.app.bean;

public class WhatsAppMetadata {
    private String phone_number_id;

	public String getPhone_number_id() {
		return phone_number_id;
	}

	public void setPhone_number_id(String phone_number_id) {
		this.phone_number_id = phone_number_id;
	}

	@Override
	public String toString() {
		return "WhatsAppMetadata [phone_number_id=" + phone_number_id + "]";
	}

	public WhatsAppMetadata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WhatsAppMetadata(String phone_number_id) {
		super();
		this.phone_number_id = phone_number_id;
	}

}
