import java.util.concurrent.*;

public class StringSubScription implements Flow.Subscription {



    @Override
    public void request(long n) {

        if (n>1){
            System.out.println("ERROR");
        }
    }



    @Override
    public void cancel() {

    }
}
