package com.demoBlaze.Browsers;

public enum Browsers {
	GOOGLE_CHROME("chrome"),
	EDGE("edge");
	String name;

	private Browsers(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
