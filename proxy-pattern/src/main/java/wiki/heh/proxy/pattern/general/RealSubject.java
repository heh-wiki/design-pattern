package wiki.heh.proxy.pattern.general;

/**
* @author heh
 */
public class RealSubject implements ISubject {

    public void request() {
        System.out.println("real service is called.");
    }

}
