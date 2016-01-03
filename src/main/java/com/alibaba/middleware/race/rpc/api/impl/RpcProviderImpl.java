package com.alibaba.middleware.race.rpc.api.impl;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.AdaptiveRecvByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;






import com.alibaba.middleware.race.rpc.api.*;


public class RpcProviderImpl extends RpcProvider
{
	private static int PORT = 8888;
	
    public RpcProviderImpl() {
    	System.out.println("rpc provider start");
    }

 
    /**
     * set the interface which this provider want to expose as a service
     * @param serviceInterface
     */
    @Override
    public RpcProvider serviceInterface(Class<?> serviceInterface){
        this.serviceInterface = serviceInterface;
        return this;
    }

    /**
     * set the version of the service
     * @param version
     */
    @Override
    public RpcProvider version(String version){
        //TODO
        return this;
    }

    /**
     * set the instance which implements the service's interface
     * @param serviceInstance
     */
    @Override
    public RpcProvider impl(Object serviceInstance){
    	this.serviceInstance = serviceInstance;
        return this;
    }

    /**
     * set the timeout of the service
     * @param timeout
     */
    @Override
    public RpcProvider timeout(int timeout){
        //TODO
        return this;
    }

    /**
     * set serialize type of this service
     * @param serializeType
     */
    @Override
    public RpcProvider serializeType(String serializeType){
        //TODO
        return this;
    }

    /**
     * publish this service
     * if you want to publish your service , you need a registry server.
     * after all , you cannot write servers' ips in config file when you have 1 million server.
     * you can use ZooKeeper as your registry server to make your services found by your consumers.
     */
    @Override
    public void publish() 
    {
    }
    
    private Object serviceInstance;
    private Class<?> serviceInterface;
    
   
}