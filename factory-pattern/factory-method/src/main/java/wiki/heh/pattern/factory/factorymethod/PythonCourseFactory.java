package wiki.heh.pattern.factory.factorymethod;

import wiki.heh.pattern.factory.ICourse;
import wiki.heh.pattern.factory.PythonCourse;

/**
 * @author heh
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
