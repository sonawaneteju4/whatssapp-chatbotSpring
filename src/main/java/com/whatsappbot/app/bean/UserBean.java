package com.whatsappbot.app.bean;

public class UserBean {
		private String userName ;
		private String userEmail;
		private int userPhone;
		private String userPass;
		
		

		public UserBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public UserBean(String userName, String userEmail, int userPhone, String userPass) {
			super();
			this.userName = userName;
			this.userEmail = userEmail;
			this.userPhone = userPhone;
			this.userPass = userPass;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public int getUserPhone() {
			return userPhone;
		}

		public void setUserPhone(int userPhone) {
			this.userPhone = userPhone;
		}

		public String getUserPass() {
			return userPass;
		}

		public void setUserPass(String userPass) {
			this.userPass = userPass;
		}

		@Override
		public String toString() {
			return "UserBean [userName=" + userName + ", userEmail=" + userEmail + ", userPhone=" + userPhone
					+ ", userPass=" + userPass + "]";
		}
		
		
		
		
}
