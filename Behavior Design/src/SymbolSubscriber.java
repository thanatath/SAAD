import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber {



    private String keepSymOnly(String input){

        return  input.replaceAll("[a-zA-Z]|[0123456789]", "");

    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        request(1);

    }

    @Override
    public void onNext(Object item) {
        System.out.println(keepSymOnly(item.toString()));
        try {
            super.printToFile(keepSymOnly(item.toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onComplete() {
        super.onComplete();
        System.out.println(" ---Symbol---");
    }
}