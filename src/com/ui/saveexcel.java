package com.ui;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;



public class saveexcel {
	public static void read() throws ParserConfigurationException, SAXException, IOException 
	{
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse("D:\\testcase.xml");
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	//NodeList nList = doc.getElementsByTagName("test");	
		
	}
	public static void begin() throws ParserConfigurationException, TransformerException{	
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("test");
		doc.appendChild(rootElement);

		// staff elements
		Element staff = doc.createElement("case");
		rootElement.appendChild(staff);
		
		// set attribute to staff element
		Attr attr = doc.createAttribute("id");
		attr.setValue("1");
		staff.setAttributeNode(attr);

		for(int i = 0; i<variables.mymap.size();i++)
		{
		String[] case1 = variables.mymap.get(i);

		String mynumbeer  = Integer.toString(i+1);
				

		
		
				// firstname elements
				Element firstname = doc.createElement("id");
				firstname.appendChild(doc.createTextNode(mynumbeer));
				staff.appendChild(firstname);

				// firstname elements
				Element firstname1 = doc.createElement("keyword");
				firstname1.appendChild(doc.createTextNode(case1[0]));
				staff.appendChild(firstname1);

				// lastname elements
				Element lastname = doc.createElement("input");
				lastname.appendChild(doc.createTextNode(case1[1]));
				staff.appendChild(lastname);

				// nickname elements
				Element nickname = doc.createElement("xpath");
				nickname.appendChild(doc.createTextNode(case1[2]));
				staff.appendChild(nickname);
		}

				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File("D:\\testcase.xml"));

				// Output to console for testing
				// StreamResult result = new StreamResult(System.out);

				transformer.transform(source, result);

				System.out.println("File saved!");

	}
}
