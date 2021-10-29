import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber{

    private String keepAlOnly(String input){

        return  input.replaceAll("[^a-zA-Z]+", "");

    }

    @Override
    public void onNext(Object item) {
        System.out.println(keepAlOnly(item.toString()));
    }
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
    }
    @Override
    public void onComplete() {
        super.onComplete();
        System.out.println(" ---Alphabet---");
    }
}
