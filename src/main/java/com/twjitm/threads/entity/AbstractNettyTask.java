package com.twjitm.threads.entity;import com.twjitm.threads.thread.task.NettyTaskQueue;/** * @author EGLS0807 - [Created on 2018-08-23 17:33] * @company http://www.g2us.com/ * @jdk java version "1.8.0_77" * 抽象任务实体 */public abstract class AbstractNettyTask implements Runnable {    private NettyTaskQueue<AbstractNettyTask> taskBlockingQueue;    public NettyTaskQueue<AbstractNettyTask> getTaskBlockingQueue() {        return taskBlockingQueue;    }    public void setTaskBlockingQueue(NettyTaskQueue<AbstractNettyTask> taskBlockingQueue) {        this.taskBlockingQueue = taskBlockingQueue;    }}