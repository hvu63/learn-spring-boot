package com.springboot.learnspringboot.enums;

public enum Status {
	NEW(1), IN_PROGRESS(2), COMPLETED(3);

	private int value;

	private Status(int value) {
		this.value = value;
	}

	// return the int value
	public Integer getValue() {
		return this.value;
	}

}
