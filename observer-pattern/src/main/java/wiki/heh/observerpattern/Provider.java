package wiki.heh.observerpattern;

import java.util.Observable;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Provider extends Observable {
    private String name;

    public Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Message msg) {
        System.out.println("生产者："+name+"，发送了一条消息");
        setChanged();
        notifyObservers(msg);

    }
}
