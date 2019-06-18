package com.akoolla;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PPMID_A_01")
public class PPMID_A_01 implements RequestBody {

	@Override
	public String someAnimal() {
		// TODO Auto-generated method stub
		return "cow";
	}
}
