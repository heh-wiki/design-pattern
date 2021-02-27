package wiki.heh.proxy.pattern.dbroute;

import wiki.heh.proxy.pattern.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author heh
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

//            order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/03/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
//            IOrderService orderService = (IOrderService)new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
