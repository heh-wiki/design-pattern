package wiki.heh.pattern.factory.abstractfactory;

/**
 * 抽象工厂测试类
 *
 * @author heh
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}
