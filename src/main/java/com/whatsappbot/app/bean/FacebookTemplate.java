package com.whatsappbot.app.bean;

public class FacebookTemplate {
	 private String name;
	    private FacebookLanguage language;
		public FacebookTemplate(String name, FacebookLanguage language) {
			super();
			this.name = name;
			this.language = language;
		}
		public FacebookTemplate() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "FacebookTemplate [name=" + name + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public FacebookLanguage getLanguage() {
			return language;
		}
		public void setLanguage(FacebookLanguage language) {
			this.language = language;
		}
}
