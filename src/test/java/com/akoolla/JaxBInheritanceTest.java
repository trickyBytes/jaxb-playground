package com.akoolla;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.StringWriter;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Test;

public class JaxBInheritanceTest {

	@Test
	public void resturnsTheCorrectMessageBodyForIHD_X_01() throws Exception {
		MAIInHomeDisplayRequest request = new MAIInHomeDisplayRequest();
		RequestBody ihdX = new IHD_X_01();
		ihdX.setSomeAnimal("Cow");
		
		request.body = Arrays.asList(ihdX);

		Marshaller marshaller = JAXBContext.newInstance(MAIInHomeDisplayRequest.class, request.body.get(0).getClass()).createMarshaller();
		
		StringWriter streamWriter = new StringWriter();
		marshaller.marshal(request, streamWriter);
		String xml = streamWriter.toString();
		assertThat("Should contain IHD_X_01 element", xml.contains("IHD_X_01"), is(true));
		assertThat("Should contain AnimalName element", xml.contains("<AnimalName>Cow</AnimalName"), is(true));
	}
	
	@Test
	public void returnsTheCorrectMessageBodyForPPMID() throws Exception {
		MAIInHomeDisplayRequest request = new MAIInHomeDisplayRequest();
		RequestBody ppmid = new PPMID_A_01();
		ppmid.setSomeAnimal("Dog");
		request.body = Arrays.asList(ppmid);
		
		Marshaller marshaller = JAXBContext.newInstance(MAIInHomeDisplayRequest.class, request.body.get(0).getClass()).createMarshaller();
		StringWriter streamWriter = new StringWriter();
		marshaller.marshal(request, streamWriter);
		String xml = streamWriter.toString();

		assertThat("Should contain PPMID_A_01 element", xml.contains("PPMID_A_01"), is(true));
		assertThat("Should contain AnimalName element", xml.contains("<AnimalName>Dog</AnimalName"), is(true));		
	}
}
