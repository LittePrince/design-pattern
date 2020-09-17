package cn.ezeeship.d_strategy.pay.payport;

/**
 * lxc
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 263;
    }
}
