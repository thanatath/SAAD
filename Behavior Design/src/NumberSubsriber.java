import java.util.concurrent.Flow;

public class NumberSubsriber extends StringSubscriber{

    private String keepNumOnly(String input){

        return  input.replaceAll("[^0123456789]+", "");

    }

    @Override
    public void onNext(Object item) {
        System.out.println(keepNumOnly(item.toString()));
    }
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
    }
    @Override
    public void onComplete() {
        super.onComplete();
        System.out.println(" ---Number---");
    }
}
