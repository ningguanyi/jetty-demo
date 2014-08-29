package org.yuqieshi.frame.jetty;

import java.io.IOException;

import org.eclipse.jetty.xml.XmlConfiguration;
import org.xml.sax.SAXException;

public class XmlConfigurationTest {
	public static void main(String[] args) throws SAXException, IOException {
		XmlConfiguration cfg = new XmlConfiguration("jetty.xml");
	}
}
