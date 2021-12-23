package wiki.heh.strategypattern2;

/**
 * @author heh
 * @date 2021/12/23
 */
public abstract class Payment {

    public abstract String getPaymentName();

    public abstract double queryBalance(String uid);

    public PayState pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        } else {
            return new PayState(200, "支付成功", "支付余额：" + (queryBalance(uid)-amount));
        }
    }
}
