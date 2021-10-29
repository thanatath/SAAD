import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Flow;

public class NumberSubsriber extends StringSubscriber{

    private String keepNumOnly(String input){

        return  input.replaceAll("[^0123456789]+", "");

    }

    @Override
    public void onNext(Object item) {
        System.out.println(keepNumOnly(item.toString()));
        try {
            super.printToFile(keepNumOnly(item.toString()));
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
