package cn.ezeeship.f_adapter.demo.power.objectadapter;


/**
 * lxc
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
