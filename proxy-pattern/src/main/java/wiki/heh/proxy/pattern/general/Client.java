package wiki.heh.proxy.pattern.general;

/**
* @author heh
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
