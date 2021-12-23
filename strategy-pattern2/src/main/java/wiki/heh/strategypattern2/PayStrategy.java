package wiki.heh.strategypattern2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heh
 * @date 2021/12/23
 */
public class PayStrategy {
    public static final String ALI_PAY = "ali";
    public static final String WECHAT_PAY = "wechat";
    public static final String DEFAULT_PAY = "wechat";

    private static Map<String,Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY,new AliPayment());
        payStrategy.put(WECHAT_PAY,new WechatPayment());
    }

    public static Payment getPayStrategy(String payKey) {
        return payStrategy.containsKey(payKey)?payStrategy.get(payKey) : payStrategy.get(DEFAULT_PAY);
    }
}
