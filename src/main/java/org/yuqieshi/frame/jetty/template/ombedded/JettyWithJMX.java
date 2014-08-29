package org.yuqieshi.frame.jetty.template.ombedded;

import java.lang.management.ManagementFactory;

import org.eclipse.jetty.jmx.MBeanContainer;
import org.eclipse.jetty.server.Server;

/**
 * denpendencies:jetty-jmx
 * 
 * @author taoistwar
 * 
 */
public class JettyWithJMX {
	public static void main(String[] args) throws Exception {
		Server server = new Server();
		// Setup JMX
		MBeanContainer mbContainer = new MBeanContainer(
				ManagementFactory.getPlatformMBeanServer());
		server.addBean(mbContainer);
		server.start();
	}
}
