package com.wangsh.jmx.mbeans;


public class Hello implements HelloMBean {
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
