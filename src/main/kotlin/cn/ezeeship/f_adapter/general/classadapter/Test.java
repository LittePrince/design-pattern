package cn.ezeeship.f_adapter.general.classadapter;

/**
 * lxc
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
