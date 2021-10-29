import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.*;

public abstract class  StringSubscriber extends StringSubScription implements Flow.Subscriber  {


    //print to file method
    public void printToFile(String data) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(this.getClass().getSimpleName()+".txt", "UTF-8");
        writer.println(data);
        writer.close();
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(Object item) {

    }

    @Override
    public void onError(Throwable throwable) {
    }
    @Override
    public void onComplete() {
        System.out.print("complete");
    }
}
