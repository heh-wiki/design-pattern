package wiki.heh.strategypattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heh
 * @date 2021/12/23
 */
public class PromotionStrategyFactory {
    private static Map<String, IPromotionStrategy> PROMOTION_STRATEGY = new HashMap<>();

    static {
        PROMOTION_STRATEGY.put("COUPON", new CouponStrategy());
        PROMOTION_STRATEGY.put("CASHBACK", new CashBackStrategy());
    }

    public PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey) {
        IPromotionStrategy p = PROMOTION_STRATEGY.get(promotionKey);
        return p == null ? new EmptyStrategy() : p;
    }
}
