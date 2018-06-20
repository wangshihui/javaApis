package com.wangsh.jmx.mbeans;

import com.wangsh.jmx.minterfaces.IHelloMBean;



public class IHello implements IHelloMBean {
	private String name = "world";

	public String getName() {
		return name;
	}

	public void setName(String name) {
	    this.name=name;
	}

	public void print() {
		System.out.println("Hello, " + name + "!!");
	}

    public void helloWorld(String string) {
        System.out.println("Hello, " + string + "!!");
    }
}
