package wiki.heh.observerpattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
