package cn.ezeeship.f_adapter.general.classadapter;

/**
 * lxc
 */
public class Adapter extends Adaptee implements Target {
    public int request() {
        return super.specificRequest() / 10;
    }
}
