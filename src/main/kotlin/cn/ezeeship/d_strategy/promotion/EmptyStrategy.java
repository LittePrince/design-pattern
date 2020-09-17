package cn.ezeeship.d_strategy.promotion;

/**
 * lxc
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
