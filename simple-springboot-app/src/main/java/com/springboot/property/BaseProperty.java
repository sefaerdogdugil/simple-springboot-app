package com.springboot.property;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseProperty implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	public List<Property> property = new ArrayList<>();

	public List<Property> getProperty() {
		return property;
	}

}
