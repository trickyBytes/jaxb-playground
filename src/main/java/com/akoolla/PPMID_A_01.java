package com.akoolla;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PPMID_A_01")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class PPMID_A_01 implements RequestBody {
	private String someAnimal;

	@XmlElement(name = "AnimalName")
	@Override
	public String getSomeAnimal() {
		return someAnimal;
	}

	@Override
	public void setSomeAnimal(String someAnimal) {
		this.someAnimal = someAnimal;		
	}
}
