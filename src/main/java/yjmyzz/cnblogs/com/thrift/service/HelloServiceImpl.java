package yjmyzz.cnblogs.com.thrift.service;

import org.apache.thrift.TException;
import yjmyzz.cnblogs.com.thrift.swift.HelloService;


public class HelloServiceImpl implements HelloService {

    public String ping() throws TException {
        return "pong";
    }
}
