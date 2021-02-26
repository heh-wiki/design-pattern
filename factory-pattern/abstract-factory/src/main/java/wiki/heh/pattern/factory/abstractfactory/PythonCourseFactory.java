package wiki.heh.pattern.factory.abstractfactory;

import wiki.heh.pattern.factory.INote;
import wiki.heh.pattern.factory.IVideo;
import wiki.heh.pattern.factory.PythonNote;
import wiki.heh.pattern.factory.PythonVideo;

/**
 * @author heh
 */
public class PythonCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new PythonNote();
    }


    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
