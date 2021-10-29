
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber{

    private String keepAlOnly(String input){

        return  input.replaceAll("[^a-zA-Z]+", "");

    }




    @Override
    public void onNext(Object item) {

        System.out.println(keepAlOnly(item.toString()));
        try {
            super.printToFile(keepAlOnly(item.toString()));
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
        System.out.println(" ---Alphabet---");
    }
}
