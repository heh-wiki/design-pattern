package wiki.heh.proxy.pattern.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

/**
* @author heh
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
