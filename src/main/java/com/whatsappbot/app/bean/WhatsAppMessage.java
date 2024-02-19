package com.whatsappbot.app.bean;

public class WhatsAppMessage {
	  private String from;
	    private WhatsAppText text;
		public WhatsAppMessage() {
			super();
			// TODO Auto-generated constructor stub
		}
		public WhatsAppMessage(String from, WhatsAppText text) {
			super();
			this.from = from;
			this.text = text;
		}
		@Override
		public String toString() {
			return "WhatsAppMessage [from=" + from + ", text=" + text + "]";
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public WhatsAppText getText() {
			return text;
		}
		public void setText(WhatsAppText text) {
			this.text = text;
		}
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		public WhatsAppMessage get(int i) {
			// TODO Auto-generated method stub
			return null;
		}


}
