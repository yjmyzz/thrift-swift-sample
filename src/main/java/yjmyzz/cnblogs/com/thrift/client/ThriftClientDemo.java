package yjmyzz.cnblogs.com.thrift.client;

import com.facebook.nifty.client.FramedClientConnector;
import com.facebook.swift.service.ThriftClientManager;
import org.apache.thrift.TException;
import yjmyzz.cnblogs.com.thrift.swift.HelloService;

import java.util.concurrent.ExecutionException;

import static com.google.common.net.HostAndPort.fromParts;

/**
 * Created by yangjunming on 3/22/16.
 * author: yangjunming@huijiame.com
 */
public class ThriftClientDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TException {

        ThriftClientManager clientManager = new ThriftClientManager();
        HelloService helloService = clientManager.createClient(
                new FramedClientConnector(fromParts("localhost", 12345)),
                HelloService.class).get();
        System.out.println(helloService.ping());

        int max = 100000;
        Long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            helloService.ping();
        }
        Long end = System.currentTimeMillis();
        Long elapse = end - start;
        int perform = Double.valueOf(max / (elapse / 1000d)).intValue();

        System.out.print("thrift " + max + " 次RPC调用，耗时：" + elapse + "毫秒，平均" + perform + "次/秒");


    }
}
