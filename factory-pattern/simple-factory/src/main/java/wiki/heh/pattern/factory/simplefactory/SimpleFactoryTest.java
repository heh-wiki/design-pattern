package wiki.heh.pattern.factory.simplefactory;

import wiki.heh.pattern.factory.ICourse;
import wiki.heh.pattern.factory.JavaCourse;
import wiki.heh.pattern.factory.PythonCourse;

/**
 * 简单工厂模型
 *
 * @author heh
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();
//
//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("wki.heh.pattern.factory.JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(PythonCourse.class);
        course.record();
    }
}
