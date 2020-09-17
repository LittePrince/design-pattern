package cn.ezeeship.b_decorator.battercake.v2;

/**
 * lxc
 */
public class EggDecorator extends BattercakeDecorator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected String getMsg(){ return super.getMsg() + "1个鸡蛋";}

    public int getPrice(){ return super.getPrice() + 1;}

}
