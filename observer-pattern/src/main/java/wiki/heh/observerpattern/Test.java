package wiki.heh.observerpattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new Provider("张三");

        Consumer a = new Consumer("A");
        Consumer b = new Consumer("B");
        provider.addObserver(a);
        provider.addObserver(b);

        Message msg = new Message("吃饭睡觉打豆豆！");
        provider.sendMessage(msg);
    }
}
