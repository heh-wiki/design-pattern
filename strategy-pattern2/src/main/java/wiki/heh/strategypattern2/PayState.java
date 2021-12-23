package wiki.heh.strategypattern2;

/**
 * @author heh
 * @date 2021/12/23
 */
public class PayState {
    private int code;
    private Object data;
    private Object msg;

    public PayState(int code, Object data, String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "支付状态=" + code +
                ", 交易信息=" + data +
                ", msg=" + msg +
                '}';
    }
}
