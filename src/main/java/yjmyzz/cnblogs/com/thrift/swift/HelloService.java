package yjmyzz.cnblogs.com.thrift.swift;

import com.facebook.swift.service.ThriftMethod;
import com.facebook.swift.service.ThriftService;
import com.google.common.util.concurrent.ListenableFuture;

@ThriftService("HelloService")
public interface HelloService
{
    @ThriftService("HelloService")
    public interface Async
    {
        @ThriftMethod(value = "ping")
        ListenableFuture<String> ping();
    }
    @ThriftMethod(value = "ping")
    String ping() throws org.apache.thrift.TException;
}