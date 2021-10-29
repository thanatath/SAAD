import java.util.concurrent.*;

class StringPublisher extends StringSubScription implements Flow.Publisher<String> {
    private final String messageString;
    StringPublisher(String textValue) {
        this.messageString = textValue;
    }
    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        subscriber.onNext(this.messageString);
        subscriber.onComplete();
    }

    @Override
    public void onNext(String item){
    }
}