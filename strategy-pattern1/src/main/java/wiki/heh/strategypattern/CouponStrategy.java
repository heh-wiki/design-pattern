package wiki.heh.strategypattern;

/**
 * 优惠劵策略
 * @author heh
 * @date 2021/12/23
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠劵");
    }
}
