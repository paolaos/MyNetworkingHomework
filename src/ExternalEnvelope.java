public class ExternalEnvelope extends Envelope{
    public ExternalEnvelope(){

    }
    public ExternalEnvelope(String macSender, String macReceiver, Message messageBody){
        this.sender = macSender;
        this.receiver = macReceiver;
        this.message = messageBody;
    }
    //share;ipsender;ipreceiver;message(body)
}
