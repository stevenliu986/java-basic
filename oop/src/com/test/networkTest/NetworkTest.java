package com.test.networkTest;

/**
 * ClassName: NetworkTest
 * Package: com.test.networkTest
 * Description: 接口应用 - 代理模式
 *
 * @Author: Steven_LIU
 * @Create: 11/01/2023
 */
public class NetworkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface Network {
    void browse();
}

/**
 * 被代理类
 */
class Server implements Network {

    @Override
    public void browse() {
        System.out.println("真实的服务器来访问网络。");
    }
}

/**
 * 代理类
 */

class ProxyServer implements Network {
    private final Network work;

    public ProxyServer(Network work) {
        this.work = work;
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }

    public void check() {
        System.out.println("执行一些联网前的检查工作。");
    }
}