package cn.ezeeship.b_decorator.battercake.v1;

/**
 * lxc
 */
public class BattercakeWithEggAndSauage extends BattercakeWithEgg {

    protected String getMsg(){ return super.getMsg() + "+1根香肠";}

    public int getPrice(){ return super.getPrice() + 2;}

}
