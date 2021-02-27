package wiki.heh.pattern.factory.factorymethod;

import wiki.heh.pattern.factory.ICourse;
import wiki.heh.pattern.factory.JavaCourse;

/**
 * @author heh
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
