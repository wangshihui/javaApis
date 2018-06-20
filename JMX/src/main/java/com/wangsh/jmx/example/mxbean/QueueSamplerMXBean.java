/**
 * QueueSamplerMXBean.java - MXBean interface describing the management
 * operations and attributes for the QueueSampler MXBean. In this case
 * there is a read-only attribute "QueueSample" and an operation "clearQueue".
 */

package  com.wangsh.jmx.example.mxbean;

public interface QueueSamplerMXBean {
    public QueueSample getQueueSample();
    
    public String getName();
    
    public void clearQueue();
}
