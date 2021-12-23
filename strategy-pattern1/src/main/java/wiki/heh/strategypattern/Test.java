package wiki.heh.strategypattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Test {

//    public static void main(String[] args) {
//        PromotionActivity activity = null;
//        String promotionKey = "Coupon";
//        if ("CashBack".equals(promotionKey)) {
//            activity = new PromotionActivity(new CashBackStrategy());
//        } else if ("Coupon".equals(promotionKey)) {
//            activity = new PromotionActivity(new CouponStrategy());
//        }
//        activity.execute();
//    }

    public static void main(String[] args) {
        PromotionStrategyFactory.getPromotionStrategy("COUPON");
    }
}
