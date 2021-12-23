package wiki.heh.delegatepattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class EmployeeC implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println(command+"工作：交给员工C来做");
    }
}
