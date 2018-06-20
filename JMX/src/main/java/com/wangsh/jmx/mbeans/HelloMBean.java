package com.wangsh.jmx.mbeans;

/**
 * 很操蛋的是 接口和实现必须在一个路径下面
 * TODO <功能简述> <br/>
 * TODO <功能详细描述>
 * @author Administrator
 */
public interface HelloMBean {
	// management attributes
	/**
	 * get 方法表明属性是可读的
	 * @return
	 */
	public String getName();
	/**
	 * set 方法表明属性是可写的
	 * @param name
	 */
	public void setName(String name);
	// management operations
	public void print();
    public void helloWorld(String string);
}
