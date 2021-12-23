package wiki.heh.strategypattern2;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("12", "D00001", 250);

        System.out.println(order.pay());
    }
}
