package org.yuqieshi.frame.jetty.template.ombedded;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * dependencies: jetty-jsp
 * 
 * @author taoistwar
 * 
 */
public class JettyWithJSP {
	public static void main(String[] args) throws Exception {
		Server server = new Server(8091);
		WebAppContext app = new WebAppContext();
		app.setContextPath("/");
		app.setResourceBase("src/main/webapp");
		app.setDefaultsDescriptor("src/main/resources/webdefault.xml");
		server.setHandler(app);
		server.start();
	}
}
