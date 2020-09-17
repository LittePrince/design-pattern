package cn.ezeeship.d_strategy.pay.payport;

/**
 * lxc
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
