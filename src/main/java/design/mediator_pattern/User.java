package design.mediator_pattern;

/**
 * Description 用户类
 * Date 2022/5/14 15:11
 * Version 1.0.1
 *
 * @author Wen
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
