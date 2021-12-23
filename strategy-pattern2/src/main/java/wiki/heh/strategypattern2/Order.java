package wiki.heh.strategypattern2;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payKey) {
        Payment payment = PayStrategy.getPayStrategy(payKey);
        System.out.println("正在使用"+payment.getPaymentName());
        System.out.println("本次交易金额:"+amount);
        return payment.pay(uid, amount);
    }
}
