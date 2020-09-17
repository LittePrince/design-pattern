package cn.ezeeship.b_decorator.battercake.v1;

/**
 * lxc
 */
public class BattercakeWithEgg extends Battercake {

    protected String getMsg(){ return super.getMsg() + "+1个鸡蛋";}

    public int getPrice(){ return super.getPrice() + 1;}

}
