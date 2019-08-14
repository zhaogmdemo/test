package com.model;

public class Introduce {
	
	private String USER_NAME;
	private String USER_PASSWORD;
	private String USER_AGE;
	private String USER_INTRO;
	private String USER_SPORTLOVE;
	private String USER_LANGUAGE;
	private String USER_UTIL;
	
	
	
	
	@Override
	public String toString() {
		return "Introduce [USER_ID="  + ", USER_NAME=" + USER_NAME + ", USER_PASSWORD=" + USER_PASSWORD
				+ ", USER_AGE=" + USER_AGE + ", USER_INTRO=" + USER_INTRO + ", USER_SPORTLOVE=" + USER_SPORTLOVE
				+ ", USER_LANGUAGE=" + USER_LANGUAGE + ", USER_UTIL=" + USER_UTIL + "]";
	}
	public Introduce() {
		super();
	}
	public Introduce( String uSER_NAME, String uSER_PASSWORD, String uSER_AGE, String uSER_INTRO,
			String uSER_SPORTLOVE, String uSER_LANGUAGE, String uSER_UTIL) {
		super();
	
		USER_NAME = uSER_NAME;
		USER_PASSWORD = uSER_PASSWORD;
		USER_AGE = uSER_AGE;
		USER_INTRO = uSER_INTRO;
		USER_SPORTLOVE = uSER_SPORTLOVE;
		USER_LANGUAGE = uSER_LANGUAGE;
		USER_UTIL = uSER_UTIL;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}
	public String getUSER_AGE() {
		return USER_AGE;
	}
	public void setUSER_AGE(String uSER_AGE) {
		USER_AGE = uSER_AGE;
	}
	public String getUSER_INTRO() {
		return USER_INTRO;
	}
	public void setUSER_INTRO(String uSER_INTRO) {
		USER_INTRO = uSER_INTRO;
	}
	public String getUSER_SPORTLOVE() {
		return USER_SPORTLOVE;
	}
	public void setUSER_SPORTLOVE(String uSER_SPORTLOVE) {
		USER_SPORTLOVE = uSER_SPORTLOVE;
	}
	public String getUSER_LANGUAGE() {
		return USER_LANGUAGE;
	}
	public void setUSER_LANGUAGE(String uSER_LANGUAGE) {
		USER_LANGUAGE = uSER_LANGUAGE;
	}
	public String getUSER_UTIL() {
		return USER_UTIL;
	}
	public void setUSER_UTIL(String uSER_UTIL) {
		USER_UTIL = uSER_UTIL;
	}


}
