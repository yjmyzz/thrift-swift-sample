package yjmyzz.cnblogs.com.thrift.server;

import com.facebook.swift.service.ThriftServer;

/**
 * Created by yangjunming on 3/22/16.
 * author: yangjunming@huijiame.com
 */
public class ThriftServerDemo {

    public static void main(String[] args) {

        ServerCreator serverCreator = new ServerCreator().invoke();
        ThriftServer server = serverCreator.getServer();

        server.start();
        System.out.println("服务已启动!");

        //serverCreator.stop();
        //serverCreator.checkExecutorsTerminated();

    }


}
