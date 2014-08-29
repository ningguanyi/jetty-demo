package org.yuqieshi.frame.jetty.ioc;

import java.util.HashMap;
import java.util.Map;

public class TestObject {
	public static void printString(Object x) {
		System.out.println(x);
	}

	int port;

	public void setPort(int port) {
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public static Map<?, ?> static_method() {
		return new HashMap<Object, Object>();
	}

	public void doStringAdd(String a, String b) {
		System.out.println("gogo(String a,String b)==>" + a + b);
	}

	public void doStringAdd() {
		System.out.println("call gogo()");
	}

}
