/**
 * QueueSampler.java - MXBean implementation for the QueueSampler MXBean.
 * This class must implement all the Java methods declared in the
 * QueueSamplerMXBean interface, with the appropriate behavior for each one.
 */

package  com.wangsh.jmx.example.mxbean;

import java.util.Date;
import java.util.Queue;

public class QueueSampler implements QueueSamplerMXBean {
    
	private String name;
	
    private Queue<String> queue;
    
    public QueueSampler(Queue<String> queue) {
        this.queue = queue;
    }
    
    
    /**
     * MXbean的get方法会转化为 mxbean的属性，
     * 每次查询MXbean的get方法对应的属性，其实调用的是get方法
     */
    public QueueSample getQueueSample() {
        synchronized (queue) {
//            return new QueueSample(new Date(), queue.size(), queue.poll());
            return new QueueSample(new Date(), queue.size(), queue.peek());
        }
    }
    
    public void clearQueue() {
        synchronized (queue) {
            queue.clear();
        }
    }


	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
