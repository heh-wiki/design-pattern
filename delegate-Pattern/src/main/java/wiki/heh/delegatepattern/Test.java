package wiki.heh.delegatepattern;

/**
 * 委派模式
 * 委派的核心：就是分发、调度、派遣
 * 委派模式：就是代理模式和策略模式的一种特殊组合
 * @author heh
 * @date 2021/12/23
 */
public class Test {

    public static void main(String[] args) {
        //委派者要持有被委派者的引用
        new Boss().command("后台",new Leader());
    }
}
