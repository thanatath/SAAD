import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.*;
import java.io.File;

public abstract class  StringSubscriber extends StringSubScription implements Flow.Subscriber  {



    //print to file method
    public void printToFile(String data) throws FileNotFoundException, UnsupportedEncodingException {
        //Clear Old Text Before Create them
        File tempFile = new File(this.getClass().getSimpleName()+".txt");
        tempFile.delete();
        //Print Contain to file
        PrintWriter writer = new PrintWriter(this.getClass().getSimpleName()+".txt", "UTF-8");
        writer.println(data);

        writer.close();
    }

    @Override
    public void onNext(Object item) {
        System.out.println(this.getClass().getSimpleName()+": Publisher Text to file !");
    }

    @Override
    public void request(long n) {
        super.request(n);
        System.out.println(this.getClass().getSimpleName()+" has SubScribe !");
    }

    @Override
    public void onError(Throwable throwable) {
    }
    @Override
    public void onComplete() {
        System.out.print("complete");
    }
}
