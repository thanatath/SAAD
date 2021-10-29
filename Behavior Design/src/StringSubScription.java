import java.util.concurrent.*;

public abstract class StringSubScription implements Flow.Subscription {

    @Override
    public void request(long n) {

    }

    @Override
    public void cancel() {

    }

    public abstract void onNext(String item);
}
