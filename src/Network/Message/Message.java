package Network.Message;

/**
 * Manipulable format for messages in all networks. Standard definition was placed in the first part of the assignment.
 */
public class Message {
    private int[] senderIp;
    private int[] receiverIp;
    private int action;
    private int[] actionIp;
    private String message;

    public Message(int[] senderIp, int[] receiverIp, int action, int[] actionIp, String message) {
        this.senderIp = senderIp;
        this.receiverIp = receiverIp;
        this.action = action;
        this.actionIp = actionIp;
        this.message = message;

    }


    public int[] getSenderIp() {
        return senderIp;
    }

    public int[] getReceiverIp() {
        return receiverIp;
    }

    public int getAction() {
        return action;
    }

    public int[] getActionIp() {
        return actionIp;
    }

    public String getMessage() {
        return message;
    }
}
