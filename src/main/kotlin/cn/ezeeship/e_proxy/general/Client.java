package cn.ezeeship.e_proxy.general;

/**
 * lxc
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
