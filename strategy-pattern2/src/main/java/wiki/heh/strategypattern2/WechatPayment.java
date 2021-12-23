package wiki.heh.strategypattern2;

/**
 * @author heh
 * @date 2021/12/23
 */
public class WechatPayment extends Payment{
    @Override
    public String getPaymentName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 800;
    }
}
