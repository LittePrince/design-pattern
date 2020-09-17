package cn.ezeeship.f_adapter.demo.power.interfaceadapter;


/**
 * lxc
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
