package com.springboot.learnspringboot.converters;

import java.util.Arrays;

import com.springboot.learnspringboot.enums.Status;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Status attribute) {
		return attribute == null ? null : attribute.getValue();
	}

	@Override
	public Status convertToEntityAttribute(Integer dbData) {
		if (dbData == null) return null;
		return Arrays.stream(Status.values()).filter(c -> c.getValue().equals(dbData)).findFirst().orElse(null);
	}

}
