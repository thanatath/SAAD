import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Flow;

public class NumberSubsriber extends StringSubscriber{



    @Override
    public void onNext(Object item) {
        super.onNext(item);
        try {
            super.printToFile(item.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        request(1);
    }
    @Override
    public void onComplete() {
        super.onComplete();
        System.out.println(" ---Number---");
    }
}
