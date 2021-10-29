import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber{

    private String keepSymOnly(String input){

        return  input.replaceAll("[a-zA-Z]+[0123456789]", "");

    }

    @Override
    public void onNext(Object item) {
        System.out.println(keepSymOnly(item.toString()));
    }
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
    }

    @Override
    public void onComplete() {
        super.onComplete();
        System.out.println(" ---Symbol---");
    }
}