package wiki.heh.strategypattern;

/**
 * 促销活动方案
 * @author heh
 * @date 2021/12/23
 */
public class PromotionActivity {
    IPromotionStrategy promotionStrategy ;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
