package com.wangsh.jmx.minterfaces;

/**
 * 很操蛋的是 接口和实现必须在一个路径下面,com.wangsh.jmx.minterfaces.IHelloMBean.IHello 就不是一个合法的Mbean
 * TODO <功能简述> <br/>
 * TODO <功能详细描述>
 * @author Administrator
 */
public interface IHelloMBean {
	// management attributes
	public String getName();
	public void setName(String name);
	// management operations
	public void print();
    public void helloWorld(String string);
}
