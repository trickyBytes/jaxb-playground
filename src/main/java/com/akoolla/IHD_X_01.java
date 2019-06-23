package com.akoolla;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IHD_X_01")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class IHD_X_01 implements RequestBody {
	private String someAnimal;
	
	@XmlElement(name = "AnimalName")
	public String getSomeAnimal() {
		return someAnimal;
	}
	
	public void setSomeAnimal(String someAnimal) {
		this.someAnimal = someAnimal;
	}
}
