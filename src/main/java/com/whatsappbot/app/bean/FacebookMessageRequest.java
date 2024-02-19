package com.whatsappbot.app.bean;

public class FacebookMessageRequest {
	private String messagingProduct;
    private String to;
    private String type;
    private FacebookTemplate template;
	public FacebookMessageRequest(String messagingProduct, String to, String type, FacebookTemplate template) {
		super();
		this.messagingProduct = messagingProduct;
		this.to = to;
		this.type = type;
		this.template = template;
	}

	@Override
	public String toString() {
		return "FacebookMessageRequest [messagingProduct=" + messagingProduct + ", to=" + to + ", type=" + type + "]";
	}
	public String getMessagingProduct() {
		return messagingProduct;
	}
	public void setMessagingProduct(String messagingProduct) {
		this.messagingProduct = messagingProduct;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public FacebookTemplate getTemplate() {
		return template;
	}
	public void setTemplate(FacebookTemplate template) {
		this.template = template;
	}
}
