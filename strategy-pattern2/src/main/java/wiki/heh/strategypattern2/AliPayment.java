package wiki.heh.strategypattern2;

/**
 * @author heh
 * @date 2021/12/23
 */
public class AliPayment extends Payment{
    @Override
    public String getPaymentName() {
        return "支付宝支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 300;
    }
}
