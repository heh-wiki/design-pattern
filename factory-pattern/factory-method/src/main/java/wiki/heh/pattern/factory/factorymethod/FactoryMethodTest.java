package wiki.heh.pattern.factory.factorymethod;

import wiki.heh.pattern.factory.ICourse;

/**
 * 工厂方法的测试
 *
 * @author heh
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

    }

}
