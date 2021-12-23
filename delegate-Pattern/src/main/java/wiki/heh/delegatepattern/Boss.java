package wiki.heh.delegatepattern;

/**
 * @author heh
 * @date 2021/12/23
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
