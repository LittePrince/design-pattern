package cn.ezeeship.e_proxy.general;

/**
 * lxc
 */
public class RealSubject implements ISubject {

    public void request() {
        System.out.println("real service is called.");
    }

}
