package wiki.heh.delegatepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Leader implements IEmployee{

    Map<String, IEmployee> map = new HashMap<>();

    public Leader() {
        map.put("前端",new EmployeeA());
        map.put("后台",new EmployeeB());
        map.put("算法",new EmployeeC());
    }

    @Override
    public void doing(String command) {
        map.get(command).doing(command);
    }
}
