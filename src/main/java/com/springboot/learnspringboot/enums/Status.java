package com.springboot.learnspringboot.enums;

public enum Status {
	NEW(1), IN_PROGRESS(2), COMPLETED(3);

	private int value;

	private Status(int value) {
		this.value = value;
	}

	public Integer getValue() {
		return switch (this) {
		case NEW -> 1;
		case IN_PROGRESS -> 2;
		case COMPLETED -> 3;
		};
	}

}
