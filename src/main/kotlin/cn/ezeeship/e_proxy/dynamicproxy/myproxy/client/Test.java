package cn.ezeeship.e_proxy.dynamicproxy.myproxy.client;


/**
 * lxc
 */
public class Test {
    public static void main(String[] args) {
        MyMeipo gpMeipo = new MyMeipo();
        IPerson zhangsan = gpMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();


//        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}
