package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    // protected String name;
    // protected String status
    int adminId;

    public SlackAdminUser(String name, String status, int adminId) {
        this.adminId = adminId;
        this.name = name;
        this.status = status;
    }

    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Akbar","Release the horses",101);
        // inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
    }

    public void sendAtChannelMessage() {
        System.out.println(name + " is send a channel message");
    }

    public void deleteMessage() {
        System.out.println(name + " is deleting a slack message");
    }

    public void addChannel() {
        System.out.println(name + " adding a new channel");
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
