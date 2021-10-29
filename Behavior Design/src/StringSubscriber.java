import java.util.concurrent.*;

public abstract class StringSubscriber extends StringSubScription implements Flow.Subscriber  {
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
    }

    @Override
    public void onNext(String item) {

    }
    @Override
    public void onError(Throwable throwable) {
    }
    @Override
    public void onComplete() {
        System.out.print("complete");
    }
}
