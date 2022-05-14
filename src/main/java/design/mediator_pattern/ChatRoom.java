package design.mediator_pattern;

import java.util.Date;

/**
 * Description 聊天室
 * Date 2022/5/14 15:10
 * Version 1.0.1
 *
 * @author Wen
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
