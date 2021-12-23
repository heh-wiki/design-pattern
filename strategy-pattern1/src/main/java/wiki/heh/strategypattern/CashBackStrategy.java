package wiki.heh.strategypattern;

/**
 * 返现策略
 *
 * @author heh
 * @date 2021/12/23
 */
public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现策略");
    }
}
