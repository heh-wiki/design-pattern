package wiki.heh.strategypattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("原价");
    }
}
