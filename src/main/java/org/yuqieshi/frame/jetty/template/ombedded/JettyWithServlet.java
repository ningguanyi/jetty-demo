package org.yuqieshi.frame.jetty.template.ombedded;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.yuqieshi.frame.jetty.HelloServlet;

public class JettyWithServlet {
	public static void main(String[] args) throws Exception {
		Server server = new Server();

		ServerConnector connector = new ServerConnector(server);
		connector.setPort(8080);
		server.setConnectors(new Connector[] { connector });

		ServletContextHandler context = new ServletContextHandler();
		context.setContextPath("/web");
		context.addServlet(HelloServlet.class, "/hello");

		HandlerCollection handlers = new HandlerCollection();
		handlers.setHandlers(new Handler[] { context, new DefaultHandler() });
		server.setHandler(handlers);

		server.start();
	}
}
