package wiki.heh.delegatepattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println(command+"工作：交给员工A来做");
    }
}
