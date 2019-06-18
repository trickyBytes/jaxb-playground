package com.akoolla;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MAIInHomeDisplayRequest {

	@XmlElementWrapper(name = "body")
	@XmlAnyElement
	public List<RequestBody> body;
}
