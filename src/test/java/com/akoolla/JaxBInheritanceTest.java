package com.akoolla;

import java.io.StringWriter;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;

public class JaxBInheritanceTest {

	@Test
	public void resturnsTheCorrectMessageBody() throws Exception {
		MAIInHomeDisplayRequest request = new MAIInHomeDisplayRequest();
		request.body = Arrays.asList(new IHD_X_01());

		Marshaller marshaller = JAXBContext.newInstance(MAIInHomeDisplayRequest.class, PPMID_A_01.class, IHD_X_01.class).createMarshaller();
	
		DOMResult result = new DOMResult();
		
		StringWriter streamWriter = new StringWriter();
		marshaller.marshal(request, streamWriter);
		
		System.out.print(streamWriter.toString());
	}
}
