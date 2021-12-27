package wiki.heh.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Consumer implements Observer {
    private String name;

    public Consumer(String name) {
        this.name = name;
    }


    public void update(Observable o, Object arg) {
        Provider provider =(Provider) o;
        Message msg = (Message) arg;
        System.out.println("==========");
        System.out.println("消费者"+name + "收到生产者"+provider.getName()+"消息");
        System.out.println("消息内容为："+msg.getContent());
    }
}
