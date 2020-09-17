package cn.ezeeship.d_strategy.pay;

import cn.ezeeship.d_strategy.pay.payport.PayStrategy;

/**
 * lxc
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","2020031401000323",324.5);
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
