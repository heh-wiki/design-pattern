package wiki.heh.pattern.factory.abstractfactory;

import wiki.heh.pattern.factory.INote;
import wiki.heh.pattern.factory.IVideo;
import wiki.heh.pattern.factory.JavaNote;
import wiki.heh.pattern.factory.JavaVideo;

/**
 * @author heh
 */
public class JavaCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
