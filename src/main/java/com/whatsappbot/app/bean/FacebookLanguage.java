package com.whatsappbot.app.bean;

public class FacebookLanguage {
    private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "FacebookLanguage [code=" + code + "]";
	}

	public FacebookLanguage(String code) {
		super();
		this.code = code;
	}

	public FacebookLanguage() {
		super();
		// TODO Auto-generated constructor stub
	}

}
